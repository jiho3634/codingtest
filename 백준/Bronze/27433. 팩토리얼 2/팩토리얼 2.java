import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long n = s.nextLong();
        if (n == 0) {
            System.out.print(1);
            return ;
        }
        long f = 1;
        for (int i = 1; i <= n; i++) {
            f *= i;
        }
        System.out.println(f);
    }
}