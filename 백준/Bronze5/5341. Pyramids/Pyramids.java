import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (true) {
            int n = s.nextInt();
            if (n == 0)
                break;
            System.out.println(n * (n + 1) / 2);
        }
    }
}
