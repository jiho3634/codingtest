import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int n = sc.nextInt();
        int a = 0;
        for (int i = 0; i < n; i++) {
            a += sc.nextInt() * sc.nextInt();
        }
        if (t == a) System.out.println("Yes");
        else System.out.println("No");
    }
}