import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int k = s.nextInt();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                if (--k == 0) {
                    System.out.print(i);
                    return ;
                }
            }
        }
        if (k > 0)
            System.out.print(0);
    }
}