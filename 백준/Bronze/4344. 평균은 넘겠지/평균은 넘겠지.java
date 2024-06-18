import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int i = 0; i < n; i++) {
            int m = s.nextInt();
            int[] arr = new int[m];
            int sum = 0;
            for (int j = 0; j < m; j++) {
                arr[j] = s.nextInt();
                sum += arr[j];
            }
            double avg = (double) sum / m;
            int cnt = 0;
            for (int k : arr) {
                if (k > avg) {
                    cnt++;
                }
            }
            System.out.printf("%.3f%%\n", (double) cnt / m * 100);
        }
        s.close();
    }
}
