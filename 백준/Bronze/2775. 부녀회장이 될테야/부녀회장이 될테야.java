import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());

            int[][] arr = new int[k][n];
            for (int j = 0; j < n; j++) {
                arr[0][j] = j + 1;
            }
            for (int j = 1; j < k; j++) {
                for (int l = 0; l < n; l++) {
                    if (l == 0) {
                        arr[j][l] = 1;
                        continue;
                    }
                    arr[j][l] = arr[j][l - 1] + arr[j - 1][l];
                }
            }
            int sum = 0;
            for (int j = 0; j < n; j++) {
                sum += arr[k -1][j];
            }
            bw.write(String.valueOf(sum));
            bw.newLine();
        }

        bw.flush();
        bw.close();
        br.close();
    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
}