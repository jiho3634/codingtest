import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if (n % 5 == 0)
            System.out.print(n / 5);
        else
            System.out.print(n / 5 + 1);
    }
}
