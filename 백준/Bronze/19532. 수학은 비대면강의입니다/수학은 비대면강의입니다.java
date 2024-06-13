import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        int d = s.nextInt();
        int e = s.nextInt();
        int f = s.nextInt();
        int y = (c * d - f * a) / (b * d - e * a);
        int x;
        if (a == 0) {
            x = (f - e * y) / d;
        } else {
            x = (c - b * y) / a;
        }
        System.out.println(x + " " + y);
    }
}
