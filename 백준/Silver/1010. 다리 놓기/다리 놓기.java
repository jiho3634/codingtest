import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            BigInteger answer = new BigInteger(String.valueOf(1));
            if (n - m > m)
                m = n - m;
            for (int j = n + 1; j < m + 1; j++) {
                answer = answer.multiply(BigInteger.valueOf(j));
            }
            for (int j = 2; j < m - n + 1; j++) {
                answer = answer.divide(BigInteger.valueOf(j));
            }
            System.out.println(answer);
        }
    }
}