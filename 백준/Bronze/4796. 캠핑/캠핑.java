import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int cnt = 0;
        while (true) {
            String[] numbers = br.readLine().strip().split(" ");
            int l = Integer.parseInt(numbers[0]);
            int p = Integer.parseInt(numbers[1]);
            int v = Integer.parseInt(numbers[2]);
            if (l == 0 && p == 0 && v == 0)
                break;
            int sum;
            if (v % p > l)
                sum = v / p * l + l;
            else
                sum = v / p * l + v % p;
            bw.write("Case " + ++cnt + ": " + sum);
            bw.newLine();
            bw.flush();
        }
        bw.close();
        br.close();
    }
}