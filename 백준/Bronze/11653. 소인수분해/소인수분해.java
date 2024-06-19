import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        if (n == 1) {
            br.close();
            return;
        }
        int m = 2;
        while (n > 1) {
            if (n % m == 0) {
                n /= m;
                bw.write(String.valueOf(m));
                bw.newLine();
            } else {
                m++;
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
