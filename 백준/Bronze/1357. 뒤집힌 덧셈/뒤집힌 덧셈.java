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
        StringBuilder sb = new StringBuilder(lines[0]);
        int a = Integer.parseInt(sb.reverse().toString());
        sb.setLength(0);
        sb.append(lines[1]);
        int b = Integer.parseInt(sb.reverse().toString());
        int sum = a + b;
        sb.setLength(0);
        bw.write("" + Integer.parseInt(sb.append(sum).reverse().toString()));
        bw.flush();
        bw.close();
        br.close();
    }
}