import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        String[] lines = br.readLine().strip().split(" ");
        int a = Integer.parseInt(lines[0]);
        int b = Integer.parseInt(lines[1]);
        int[] arr = new int[b];
        int cnt = 0;
        int idx = 0;
        int c = 1;
        while (true) {
            for (int i = 1; i <= c; i++, idx++, cnt++) {
                if (cnt == b)
                    break;
                arr[idx] = c;
            }
            if (cnt == b)
                break;
            c++;
        }
        int sum = 0;
        for (int i = a - 1; i < b; i++) {
            sum += arr[i];
        }
        bw.write(sb.append(sum).toString());
        bw.flush();
        bw.close();
        br.close();
    }
}