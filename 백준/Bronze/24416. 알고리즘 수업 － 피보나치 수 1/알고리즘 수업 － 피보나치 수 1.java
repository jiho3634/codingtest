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
        int a = 0;
        int b = 2;
        int c = 3;
        for (int i = 5; i <= n; i++) {
            a = b;
            b = c;
            c = a + b;
        }
        bw.write(c + " " + (n - 2));
        bw.flush();
        bw.close();
        br.close();
    }
}