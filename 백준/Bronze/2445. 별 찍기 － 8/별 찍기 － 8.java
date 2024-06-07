import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = Integer.parseInt(s.nextLine());
        for (int i = 1; i <= n; i++)
            System.out.println("*".repeat(i) + " ".repeat(2 * n - 2 * i) + "*".repeat(i));
        for (int i = n - 1; i >= 0; i--) {
            System.out.println("*".repeat(i) + " ".repeat(2 * n - 2 * i) + "*".repeat(i));
        }
    }
}