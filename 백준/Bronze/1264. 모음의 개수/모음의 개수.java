import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int cnt = 0;
            String line = sc.nextLine();
            if (line.equals("#")) break ;
            for (char c : line.toCharArray()) {
                if ("aeiouAEIOU".indexOf(c) >= 0)
                    cnt++;
            }
            System.out.println(cnt);
        }
        sc.close();
    }
}