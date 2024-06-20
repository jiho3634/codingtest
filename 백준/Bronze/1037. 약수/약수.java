import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());
        String[] lines = br.readLine().strip().split(" ");
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < t; i++) {
            int a = Integer.parseInt(lines[i]);
            if (max < a)
                max = a;
            if (min > a)
                min = a;
        }
        bw.write(String.valueOf(max * min));
        bw.newLine();
        bw.flush();
        bw.close();
        br.close();
    }
}

