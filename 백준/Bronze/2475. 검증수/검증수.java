import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double mod = 0;
        for (int i = 0; i < 5; i++) {
            int n = scanner.nextInt();
            mod += Math.pow(n, 2);
        }
        System.out.print((int)(mod % 10));
        scanner.close();
    }
}
