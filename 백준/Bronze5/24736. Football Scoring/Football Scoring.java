import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print(s.nextInt() * 6 + s.nextInt() * 3 + s.nextInt() * 2 + s.nextInt() + s.nextInt() * 2);
        System.out.print(" ");
        System.out.println(s.nextInt() * 6 + s.nextInt() * 3 + s.nextInt() * 2 + s.nextInt() + s.nextInt() * 2);
    }
}