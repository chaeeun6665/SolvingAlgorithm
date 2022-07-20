import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2750 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        int[] array = new int[num];

        if(num>=1 && num<=1000){
            for(int i=0; i<num; i++){
                int input = Integer.parseInt(br.readLine());
                array[i] = input;
            }
        }
        SortingAlgorithm(array);
    }

    public static void SortingAlgorithm(int[] arr){

        for(int i=1; i<arr.length; i++){
            for(int j=i; j>0; j--){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
