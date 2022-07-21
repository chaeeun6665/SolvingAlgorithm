import java.io.*;
import java.util.Arrays;

public class Main2108 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int numOfNum;
        while (true) {
            numOfNum = Integer.parseInt(br.readLine());
            if (numOfNum >= 1 && numOfNum <= 500000) {
                if (numOfNum % 2 == 1) {
                    break;
                }
            }
        }

        int[] arr = new int[numOfNum];
        int sum = 0;
        for (int i = 0; i < numOfNum; i++){
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
        }

        //산술평균
        float sansul = (float)sum/(float)numOfNum;
        int sansulResult;
        if(sansul*10%10 >= 5){
            sansulResult = (int)(sansul+1);
        }
        else{
            sansulResult = (int)(sansul);
        }
        bw.write(String.valueOf(sansulResult+"\n"));

        //중앙값
        Arrays.sort(arr);
        int index = numOfNum/2;
        bw.write(String.valueOf(arr[index]+ "\n"));

        //최빈값
        int range = arr[numOfNum-1]-arr[0]+1;
        int[] modeArr = new int[range];
        int sub = arr[0];

        for(int i=0; i<arr.length ; i++) {
            modeArr[arr[i] - sub] += 1;
        }

        int max = 0;
        int mode = 0;
        for(int i=0; i<modeArr.length; i++){
            if(modeArr[i]>max){
                max = modeArr[i];
                mode = i + sub;
            }
        }

        bw.write(String.valueOf(mode + "\n"));

        //범위
        bw.write(String.valueOf(arr[numOfNum-1]-arr[0]));

        bw.close();
    }
}
