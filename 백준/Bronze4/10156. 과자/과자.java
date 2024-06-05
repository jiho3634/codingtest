import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt() * sc.nextInt() - sc.nextInt();
        if (n < 0)
            n = 0;
        System.out.print(n);
        sc.close();
    }
}