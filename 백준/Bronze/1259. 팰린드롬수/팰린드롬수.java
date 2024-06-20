import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            String line = br.readLine();
            if (line.charAt(0) == '0')
                break;
            int len = line.length();
            if (len == 1) {
                bw.write("yes");
                bw.newLine();
                bw.flush();
                continue;
            }
            for (int i = 0; i < len / 2; i++) {
                if (line.charAt(i) != line.charAt(len - 1 - i)) {
                    bw.write("no");
                    bw.newLine();
                    bw.flush();
                    break;
                } else if (i == len / 2 - 1) {
                    bw.write("yes");
                    bw.newLine();
                    bw.flush();
                }
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}

