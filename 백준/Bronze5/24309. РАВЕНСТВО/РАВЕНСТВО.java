import java.util.Scanner;
import java.math.BigInteger;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        BigInteger a = s.nextBigInteger();
        BigInteger b = s.nextBigInteger();
        BigInteger c = s.nextBigInteger();
        System.out.println(b.subtract(c).divide(a));
    }
}
