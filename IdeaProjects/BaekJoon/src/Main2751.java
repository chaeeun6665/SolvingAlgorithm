import java.io.*;
import java.util.Arrays;

public class Main2751 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine());
        int[] array = new int[num];

        if(num>=1 && num<=1000000){
            for(int i=0; i<num; i++){
                int input = Integer.parseInt(br.readLine());
                array[i] = input;
            }
        }
        SortingAlgorithm(array);
    }

    public static void SortingAlgorithm(int[] arr) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Arrays.sort(arr);
        /*for(int i=1; i<arr.length; i++){
            for(int j=i; j>0; j--){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }*/
        for(int i=0; i<arr.length; i++){
            bw.write(String.valueOf(arr[i])+"\n");
        }
        bw.close();
    }
}
