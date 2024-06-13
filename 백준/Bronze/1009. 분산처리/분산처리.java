import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int i = 0; i < n; i++) {
            int a = s.nextInt();
            a = a % 10;
            if (a == 0) System.out.println(10);
            int b = s.nextInt();
            if (a == 1 || a == 5 || a == 6)
                System.out.println(a);
            else if (a == 2 || a == 3 || a == 7 || a == 8) {
                b = b % 4 == 0 ? 4 : b % 4;
                int c = (int)Math.pow(a, b) % 10;
                System.out.println(c == 0 ? 10 : c);
            } else if (a == 4 || a == 9) {
                b = b % 2 == 0 ? 2 : 1;
                int c = (int)Math.pow(a, b) % 10;
                System.out.println(c == 0 ? 10 : c);
            }
        }
    }
}
