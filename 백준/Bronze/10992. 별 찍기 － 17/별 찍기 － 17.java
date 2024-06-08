import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(" ".repeat(n - 1) + "*");
        for (int i = 2; i < n; i++)
            System.out.println(" ".repeat(n - i) + "*" + " ".repeat(2 * i - 3) + "*");
        if (n != 1)
            System.out.print("*".repeat(2 * n - 1));
    }
}