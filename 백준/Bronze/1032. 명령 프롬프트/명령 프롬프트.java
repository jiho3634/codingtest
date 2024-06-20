import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        if (n == 1) {
            bw.write(br.readLine());
            bw.flush();
            bw.close();
            return;
        }
        String[] lines = new String[n];
        for (int i = 0; i < n; i++) {
            lines[i] = br.readLine();
        }
        int len = lines[0].length();
        for (int i = 0; i < len; i++) {
            boolean b = true;
            for (int j = 0; j < n - 1; j++) {
                if (lines[j].charAt(i) != lines[j + 1].charAt(i)) {
                    b = false;
                    break;
                }
            }
            if (b)
                sb.append(lines[0].charAt(i));
            else
                sb.append("?");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}