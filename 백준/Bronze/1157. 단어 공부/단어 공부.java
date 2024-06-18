import java.util.*;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String line = s.nextLine();
        int max = 0;
        int i = 0;
        int[] arr = new int['z' - 'a' + 1];
        for (char c : line.toCharArray()) {
            if (Character.isUpperCase(c)) {
                arr[c - 'A']++;
                if (arr[c - 'A'] > max) {
                    max = arr[c - 'A'];
                    i = c - 'A';
                }
            } else {
                arr[c - 'a']++;
                if (arr[c - 'a'] > max) {
                    max = arr[c - 'a'];
                    i = c - 'a';
                }
            }
        }
        int cnt = 0;
        for (int v : arr) {
            if (v == max)
                cnt++;
        }
        if (cnt != 1)
            System.out.println("?");
        else {
            System.out.println((char) ('A' + i));
        }
        s.close();
    }
}
