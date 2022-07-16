import java.io.*;
import java.util.StringTokenizer;

public class BaekJoon1712 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s);
        String array[] = s.split(" ");
        long a = Long.parseLong(array[0]);
        long b = Long.parseLong(array[1]);
        long c = Long.parseLong(array[2]);
        long point = 0;

        if(b>=c){
            point = -1;
        }
        else{
            point = a/(c-b)+1;
        }

        bw.write(Long.toString(point));

        bw.close();
    }
}
