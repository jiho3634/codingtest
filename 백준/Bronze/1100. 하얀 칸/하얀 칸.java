import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int ans = 0;
        for (int i = 0; i < 8; i++) {
            String tmp = s.nextLine();
            int j = 0;
            if (i % 2 == 1)
                j = 1;
            for (; j < 8; j += 2) {
                if (tmp.charAt(j) == 'F')
                    ans++;
            }
        }
        System.out.println(ans);
    }
}
