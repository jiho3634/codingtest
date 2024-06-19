import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] line = br.readLine().strip().split(" ");
        int n = Integer.parseInt(line[0]);
        int k = Integer.parseInt(line[1]);

        int answer = 1;
        for (int i = 0; i < k; i++) {
            answer = answer * (n - i) / (i + 1);
        }
        System.out.println(String.valueOf(answer));

        bw.flush();
        bw.close();
        br.close();
    }
}
