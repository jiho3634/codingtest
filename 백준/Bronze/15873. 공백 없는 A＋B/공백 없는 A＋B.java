import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n > 109)
            System.out.print(n / 100 + n % 100);
        else
            System.out.print(n / 10 + n % 10);
        sc.close();
    }
}
