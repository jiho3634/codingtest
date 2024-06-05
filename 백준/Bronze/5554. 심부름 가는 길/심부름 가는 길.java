import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt() + sc.nextInt() + sc.nextInt() + sc.nextInt();
        System.out.print(n / 60 + "\n" + n % 60);
        sc.close();
    }
}