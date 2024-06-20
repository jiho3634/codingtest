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
        while (true) {
            List<Integer> list = new ArrayList<>();
            int n = Integer.parseInt(br.readLine());
            if (n < 2)
                break;
            int sum = 0;
            for (int i = 1; i < n; i++) {
                if (n % i == 0) {
                    list.add(i);
                    sum += i;
                }
            }
            if (sum == n) {
                for (Integer i : list) {
                    sb.append(i).append(" + ");
                }
                bw.write(sum + " = ");
                bw.write(sb.substring(0, sb.length() - 3));
                bw.newLine();
            }
            else {
                bw.write(n + " is NOT perfect.");
                bw.newLine();
            }
            sb.setLength(0);
        }
        bw.flush();
        bw.close();
        br.close();
    }
}

