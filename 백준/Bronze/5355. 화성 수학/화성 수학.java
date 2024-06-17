import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine().strip());
        for (int i = 0; i < n; i++) {
            double d = scanner.nextDouble();
            String[] line = scanner.nextLine().strip().split(" ");
            for (String c : line) {
                if (c.charAt(0) == '@')
                    d *= 3;
                else if (c.charAt(0) == '%')
                    d += 5;
                else if (c.charAt(0) == '#')
                    d -= 7;
            }
            System.out.printf("%.2f\n", d);
        }
    }
}
