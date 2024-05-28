import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        int[] numbers = new int[n];
        for (int idx = 0; idx < n; idx++) {
            numbers[idx] = idx + 1;
        }
        for (int idx = 0; idx < m; idx++) {
            int i = s.nextInt() - 1;
            int j = s.nextInt() - 1;
            int k = numbers[i];
            numbers[i] = numbers[j];
            numbers[j] = k;
        }
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        s.close();
    }
}
