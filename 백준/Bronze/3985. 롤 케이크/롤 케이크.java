import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int l = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        boolean[] cake = new boolean[l];
        int maxBefore = Integer.MIN_VALUE;
        int answerBefore = 0;
        int maxAfter = Integer.MIN_VALUE;
        int answerAfter = 0;

        for (int i = 0; i < n; i++) {
            String[] number = br.readLine().strip().split(" ");
            int p = Integer.parseInt(number[0]) - 1;
            int k = Integer.parseInt(number[1]) - 1;
            if (maxBefore < (k - p + 1)) {
                maxBefore = k - p + 1;
                answerBefore = i + 1;
            }
            int cnt = 0;
            for (int j = p; j <= k; j++) {
                if (!cake[j]) {
                    cake[j] = true;
                    cnt++;
                }
            }
            if (maxAfter < cnt) {
                maxAfter = cnt;
                answerAfter = i + 1;
            }
        }
        bw.write(String.valueOf(answerBefore));
        bw.newLine();
        bw.write(String.valueOf(answerAfter));

        bw.flush();
        bw.close();
        br.close();
   }
}

