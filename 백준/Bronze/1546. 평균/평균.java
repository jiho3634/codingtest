import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        double max = Integer.MIN_VALUE;
        double sum = 0;
        for (int i = 0; i < n; i++) {
            double m = s.nextInt();
            if (max < m)
                max = m;
            sum += m;
        }
        System.out.println(sum / max * 100 / n);
        s.close();
    }
}
