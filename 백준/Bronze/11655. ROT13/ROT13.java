import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        char[] line = br.readLine().toCharArray();
        for (Character c : line) {
            if (Character.isUpperCase(c)) {
                sb.append((char)((c + 13 - 'A') % 26 + 'A'));
            } else if (Character.isLowerCase(c)) {
                sb.append((char)((c + 13 - 'a') % 26 + 'a'));

            } else {
                sb.append(c);
            }
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}