import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] lines = br.readLine().strip().split(" ");
        int n = Integer.parseInt(lines[0]);
        int m = Integer.parseInt(lines[1]);
        int sum = (m - 1) + (n - 1) * m;
        bw.write(String.valueOf(sum));
        bw.flush();
        bw.close();
        br.close();
    }
}

