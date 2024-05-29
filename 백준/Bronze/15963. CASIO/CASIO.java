import java.util.Scanner;
import java.math.BigInteger;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        BigInteger a = s.nextBigInteger();
        BigInteger b = s.nextBigInteger();
        if (a.compareTo(b) == 0)
            System.out.print(1);
        else
            System.out.print(0);
    }
}
