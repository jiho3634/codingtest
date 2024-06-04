import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n = scanner.nextInt();
        double m = scanner.nextInt();
        System.out.println(n / m);
        scanner.close();
    }
}
