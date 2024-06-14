import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < n; i += 2)
                System.out.print("* ");
            System.out.println();
            for (int i = 1; i < n; i += 2)
                System.out.print(" *");
            System.out.println();
        }
    }
}