import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int sum = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < 7; i++) {
            int n = s.nextInt();
            if (n % 2 == 1) {
                sum += n;
                if (min > n)
                    min = n;
            }
        }
        if (sum == 0)
            System.out.print(-1);
        else
            System.out.print(sum + "\n" + min);
    }
}