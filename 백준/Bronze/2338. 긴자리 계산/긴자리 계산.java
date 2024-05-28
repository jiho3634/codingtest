import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger n = scanner.nextBigInteger();
        BigInteger m = scanner.nextBigInteger();
        System.out.println(n.add(m));
        System.out.println(n.subtract(m));
        System.out.println(n.multiply(m));
        scanner.close();
    }
}