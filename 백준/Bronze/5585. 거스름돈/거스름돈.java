import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = 1000 - s.nextInt();
        System.out.println(n / 500 + n % 500 / 100 + n % 500 % 100 / 50 + n % 500 % 100 % 50 / 10 + n % 500 % 100 % 50 % 10 / 5 + n % 500 % 100 % 50 % 10 % 5);
    }
}
