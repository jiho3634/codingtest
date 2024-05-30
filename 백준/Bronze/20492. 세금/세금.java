import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();

        System.out.print((int)(0.78 * a));
        System.out.print(" ");
        System.out.print((int)(a * 0.8 + a * 0.2 * 0.78));
    }
}
