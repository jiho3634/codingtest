import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int i = n - 1; i >= -n + 1; i --) {
            System.out.println("*".repeat(n - Math.abs(i)));
        }
    }
}