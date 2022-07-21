import java.io.*;
import java.util.Arrays;
import java.util.Collections;

public class Main1427 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long num = Integer.parseInt(bf.readLine());
        long numToTest = num;
        //자리수
        int count = 0;
        while(true){
            numToTest = numToTest/10;
            count++;
            if(numToTest<1){
                break;
            }
        }

        Long[] numArr = new Long[count];
        for(int i=0; i<count; i++){
            numArr[i] = num%10;
            num = num/10;
        }

        Arrays.sort(numArr, Collections.reverseOrder());
        long result = 0;
        for(int i=0; i<numArr.length; i++){
            result = (result*10) + numArr[i];
        }
        System.out.println(result);
    }
}
