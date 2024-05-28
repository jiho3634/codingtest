import java.math.BigInteger;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        BigInteger a = s.nextBigInteger();
        BigInteger b = s.nextBigInteger();
        System.out.println(a.add(b).divide(BigInteger.valueOf(2)));
        System.out.println(a.subtract(b).divide(BigInteger.valueOf(2)));
    }
}
