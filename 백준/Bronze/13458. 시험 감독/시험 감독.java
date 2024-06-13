import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = s.nextInt();
        int a = s.nextInt();
        int b = s.nextInt();
        long sum = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] <= a)
                sum += 1;
            else {
                sum += 1; // 총감독관 + 1
                if ((arr[i] - a) % b == 0)
                    sum += (arr[i] - a) / b;
                else
                    sum += (arr[i] - a) / b + 1;
            }
        }
        System.out.println(sum);
    }
}
