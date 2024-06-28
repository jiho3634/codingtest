import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static char[] buffer;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            char[] s = scanner.nextLine().toCharArray();
            boolean[] used = new boolean[s.length];
            buffer = new char[s.length];
            Arrays.sort(s);
            dfs(s, used, 0);
        }
    }

    static void dfs(char[] s, boolean[] used, int len) {
        if (len == s.length) {
            System.out.println(buffer);
        }

        else {
            boolean[] arr = new boolean[s.length];
            for (int i = 0; i < s.length; i++) {
                if (!used[i] && !arr[i]) {
                    buffer[len] = s[i];
                    used[i] = true;
                    dfs(s, used.clone(), len + 1);
                    used[i] = false;
                    for (int j = 0; j < s.length; j++) {
                        if (s[j] == s[i] && !used[j]) {
                            arr[j] = true;
                        }
                    }
                }
            }
        }
    }
}

