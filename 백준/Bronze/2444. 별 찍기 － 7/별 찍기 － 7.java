import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        for (int i = 1; i < N; i++)
            System.out.println(" ".repeat(N - i) + "*".repeat(2 * i - 1));
        for (int i = N; i > 0; i--)
            System.out.println(" ".repeat(N - i) + "*".repeat(2 * i - 1));
    }
}