import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt() * sc.nextInt();
        System.out.print(sc.nextInt() - n + " ");
        System.out.print(sc.nextInt() - n + " ");
        System.out.print(sc.nextInt() - n + " ");
        System.out.print(sc.nextInt() - n + " ");
        System.out.print(sc.nextInt() - n);
        sc.close();
    }
}