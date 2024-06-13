import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        int n = s.nextInt();
        int sum = 0;
        int min = Integer.MAX_VALUE;
        boolean exception = false;
        for (int i = m; i <= n; i++) {
            double tmp = Math.sqrt(i);
            if (tmp - (int)tmp == 0) {
                sum += i;
                if (min > i) {
                    min = i;
                }
                exception = true;
            }
        }
        if (!exception) {
            System.out.println(-1);
        } else {
            System.out.println(sum);
            System.out.println(min);
        }
    }
}
