import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x1 = s.nextInt();
        int y1 = s.nextInt();
        int x2 = s.nextInt();
        int y2 = s.nextInt();
        int x3 = s.nextInt();
        int y3 = s.nextInt();
        if (x1 == x2)
            System.out.print(x3 + " ");
        if (x2 == x3)
            System.out.print(x1 + " ");
        if (x3 == x1)
            System.out.print(x2 + " ");
        if (y1 == y2)
            System.out.print(y3);
        if (y2 == y3)
            System.out.print(y1);
        if (y3 == y1)
            System.out.print(y2);
    }
}