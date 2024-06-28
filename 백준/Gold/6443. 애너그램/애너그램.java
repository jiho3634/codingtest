import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    static StringBuilder sb = new StringBuilder();
    static char[] buffer;
    static boolean[] used;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter((new OutputStreamWriter(System.out)));

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            char[] s = br.readLine().toCharArray();
            buffer = new char[s.length];
            used = new boolean[s.length];
            Arrays.sort(s);
            dfs(s, 0);
        }
        bw.write(sb.toString());
        bw.flush();
        br.close();
        bw.close();
    }

    static void dfs(char[] s, int len) {
        if (len == s.length) sb.append(buffer).append("\n");
        else {
            for (int i = 0; i < s.length; i++) {
                if (!used[i]) {
                    buffer[len] = s[i];
                    used[i] = true;
                    dfs(s, len + 1);
                    used[i] = false;
                    while (i + 1 < s.length && s[i] == s[i + 1]) i++;
                }
            }
        }
    }
}