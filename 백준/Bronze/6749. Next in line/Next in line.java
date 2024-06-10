import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        int a = sc.nextInt();
        System.out.println(a * 2 - y);
        sc.close();
    }
}