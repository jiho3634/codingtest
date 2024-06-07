import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int i = 0; i < n; i++) {
            int a = s.nextInt();
            System.out.println(a / 25 + " " + a % 25 / 10 + " " + a % 25 % 10 / 5 + " " + a % 25 % 10 % 5);
        }
    }
}