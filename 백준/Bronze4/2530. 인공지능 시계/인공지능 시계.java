import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        int s = sc.nextInt();
        int n = sc.nextInt();

        s = s + n;
        if (s >= 60) {
            m = m + s / 60;
            s = s % 60;
        }
        if (m >= 60) {
            h = h + m / 60;
            m = m % 60;
        }
        if (h >= 24) {
            h = h % 24;
        }
        System.out.print(h + " " + m + " " + s);
        sc.close();
    }
}