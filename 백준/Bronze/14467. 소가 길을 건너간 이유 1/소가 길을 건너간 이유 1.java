import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[10];
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            String[] numbers = br.readLine().strip().split(" ");
            int number = Integer.parseInt(numbers[0]) - 1;
            int position = Integer.parseInt(numbers[1]) + 1;
            if (arr[number] == 0) {
                arr[number] = position;
            } else if (arr[number] == position) {
                continue;
            } else {
                cnt++;
                arr[number] = position;
            }
        }
        bw.write("" + cnt);
        bw.flush();
        bw.close();
        br.close();
   }
}
