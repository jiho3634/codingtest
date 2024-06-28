import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static char[] buffer;
    static boolean[] used;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            char[] s = scanner.nextLine().toCharArray();
            used = new boolean[s.length];
            buffer = new char[s.length];
            Arrays.sort(s);
            dfs(s, 0);
        }
    }

    static void dfs(char[] s, int len) {
        if (len == s.length) {
            System.out.println(buffer);
        }
        else {
            boolean[] used2 = new boolean['z' - 'a' + 1];
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