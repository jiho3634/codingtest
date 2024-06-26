import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int i = 1;
        int sum = 0;
        while (true) {
            sum = i * (i + 1) / 2;
            if (sum >= n) {
                break;
            } else {
                i++;
            }
        }
        int idx = n - (i - 1) * i / 2;
        if (i % 2 == 1) {
            bw.write((i - idx + 1) + "/" + idx);
        } else {
            bw.write(idx + "/" + (i - idx + 1));
        }

        bw.flush();
        bw.close();
        br.close();
    }
}

