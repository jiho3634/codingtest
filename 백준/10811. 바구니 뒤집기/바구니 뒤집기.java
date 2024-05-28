import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] numbers = new int[n];
        for (int idx = 0; idx < n; idx++) {
            numbers[idx] = idx + 1;
        }
        for (int idx = 0; idx < m; idx++) {
            int i = scanner.nextInt() - 1;
            int j = scanner.nextInt() - 1;
            for (; i < j; i++, j--) {
                int tmp = numbers[i];
                numbers[i] = numbers[j];
                numbers[j] = tmp;
            }
        }
        for (int idx = 0; idx < n; idx++) {
            System.out.print(numbers[idx] + " ");
        }
        scanner.close();
    }
}
