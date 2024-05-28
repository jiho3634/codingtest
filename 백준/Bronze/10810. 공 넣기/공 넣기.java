import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        int[] numbers = new int[n];
        for (int idx = 0; idx < m; idx++) {
            int i = s.nextInt();
            int j = s.nextInt();
            int k = s.nextInt();
            for (int idy = i - 1; idy < j; idy++) {
                numbers[idy] = k;
            }
        }
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        s.close();
    }
}
