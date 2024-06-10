import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextInt();
        long b = sc.nextInt();
        long c = sc.nextInt();
        if (a + b >= 2 * c)
            System.out.print(a + b - 2 * c);
        else
            System.out.print(a + b);
        sc.close();
    }
}
