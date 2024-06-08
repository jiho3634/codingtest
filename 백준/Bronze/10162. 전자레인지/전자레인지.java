import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if (n % 10 != 0)
            System.out.print(-1);
        else
            System.out.println(n / 300 + " " + n % 300 / 60 + " " + n % 300 % 60 / 10);
    }
}