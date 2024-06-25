import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String n = br.readLine();
        for (int i = 1; i < n.length(); i++) {
            long a = 1;
            for (int j = 0; j < i; j++) {
                a *= n.charAt(j) - '0';
            }
            long b = 1;
            for (int j = i; j < n.length(); j++) {
                b *= n.charAt(j) - '0';
            }
            if (a == b) {
                bw.write("YES");
                bw.flush();
                bw.close();
                br.close();
                return ;
            }
        }
        bw.write("NO");
        bw.flush();
        bw.close();
        br.close();
   }
}

