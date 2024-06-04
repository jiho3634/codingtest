import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        if (n > m)
            System.out.println(">");
        else if (n < m)
            System.out.println("<");
        else
            System.out.println("==");
        scanner.close();
    }
}
