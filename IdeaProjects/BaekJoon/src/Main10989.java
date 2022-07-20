import java.io.*;

//카운트 정렬을 이용한 정렬
public class Main10989 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine());
        int maxNum = 0;
        int[] array = new int[num];

        if(num>=1 && num<=10000000){
            for(int i=0; i<num; i++){
                int input = Integer.parseInt(br.readLine());
                if(input<=10000&&input>0){
                    array[i] = input;
                    if(input>maxNum){
                        maxNum = input;
                    }
                }
                else
                    i--;
            }
        }
        CountingSortingAlgorithm(array, maxNum, num);
    }

    public static void CountingSortingAlgorithm(int[] arr, int maxNum, int num) throws IOException {
        int[] countingArray = new int[maxNum+1];
        int[] result = new int[num];
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for(int i=0; i<arr.length; i++){
            countingArray[arr[i]]++;
        }

        for(int i=1; i<countingArray.length; i++){
            countingArray[i] = countingArray[i-1] + countingArray[i];
        }

        for(int i=arr.length-1; i>=0; i--){
            countingArray[arr[i]]--;
            int newIndexNum = countingArray[arr[i]];
            result[newIndexNum] = arr[i];
        }

        for(int i=0; i<result.length; i++){
            bw.write(String.valueOf(result[i])+ "\n");
        }
        bw.close();
    }
}
