import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = 0;
        int b = 0;
        int c = 0;
        for (int i = 0; i < 10; i++) {
            a = b;
            b += Integer.parseInt(br.readLine());
            if (Math.abs(a - 100) >= Math.abs(b - 100)) {
                if (Math.abs(b - 100) <= Math.abs(c - 100))
                    c = b;
            }
        }
        bw.write(String.valueOf(c));
        bw.flush();
        bw.close();
        br.close();
    }
}