import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            char c = 'A' - 1;
            for (int j = 0; j < 4; j++) {
                if (s.nextInt() == 0)
                    c++;
            }
            if (c == 'A' - 1)
                c = 'E';
            System.out.println(c);
        }
    }
}