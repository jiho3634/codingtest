import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String[] numbers = br.readLine().strip().split(" ");
            int[] arr = new int[10];
            for (int j = 0; j < 10; j++) {
                arr[j] = Integer.parseInt(numbers[j]);
            }
            Arrays.sort(arr);
            bw.write("" + arr[7]);
            bw.newLine();
        }
        bw.flush();
        bw.close();
        br.close();
    }
}