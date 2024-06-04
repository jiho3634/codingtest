import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger n = scanner.nextBigInteger();
        BigInteger m = scanner.nextBigInteger();
        BigInteger quotient = n.divide(m);
        BigInteger remainder = n.mod(m);
        System.out.println(quotient);
        System.out.println(remainder);
        scanner.close();
    }
}
