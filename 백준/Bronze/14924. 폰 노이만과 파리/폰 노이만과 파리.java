import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int t = sc.nextInt();
        int d = sc.nextInt();

        System.out.print(t * d / s / 2);
        sc.close();
    }
}
