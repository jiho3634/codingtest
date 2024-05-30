import java.util.Scanner;
import java.math.BigInteger;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i = 1;
        while (true) {
            int n = s.nextInt();
            if (n == 0)
                break ;
            s.nextLine();
            System.out.println("Case " + i++ + ": Sorting... done!");
        }
    }
}
