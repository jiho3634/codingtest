import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int i = 0; i < n; i++)
            System.out.println(" ".repeat(i) + "*".repeat(2 * n - 1 - 2 * i));
        for (int i = n - 1; i > 0; i--)
            System.out.println(" ".repeat(i - 1) + "*".repeat(2 * n - 1 - 2 * (i - 1)));
    }
}