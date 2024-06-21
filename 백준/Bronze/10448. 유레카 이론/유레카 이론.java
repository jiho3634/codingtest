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
        loop1 :
        for (int i = 0; i < t; i++) {
            int k = Integer.parseInt(br.readLine());
            int n = 1;
            while (n * (n + 1) / 2 < k) {
                n++;
            }
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = (j + 1) * (j + 2) / 2;
            }
            for (int j = 0; j < n; j++) {
                for (int l = 0; l < n; l++) {
                    for (int m = 0; m < n; m++) {
                        if (arr[j] + arr[l] + arr[m] == k) {
                            bw.write("1");
                            bw.newLine();
                            bw.flush();
                            continue loop1;
                        }
                    }
                }
            }
            bw.write("0");
            bw.newLine();
            bw.flush();
        }
        bw.close();
        br.close();
    }
}