import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            int s = scanner.nextInt();
            System.out.println(s / (n + 1));
        }
    }
}
