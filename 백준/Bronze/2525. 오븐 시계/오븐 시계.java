import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        int c = sc.nextInt();

        int x = c / 60;
        int y = c % 60;

        h += x;
        m += y;
        if (m >= 60) {
            h++;
            m -= 60;
        }
        h %= 24;
        System.out.println(h+" "+m);
    }
}
