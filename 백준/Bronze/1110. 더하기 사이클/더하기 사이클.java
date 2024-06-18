import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int cycle = 0;
        int m = n;
        while (true) {
            cycle++;
            m = (m % 10 * 10) + ((m / 10 + m % 10) % 10);
            if (m == n)
                break;
        }
        System.out.println(cycle);
        s.close();
    }
}
