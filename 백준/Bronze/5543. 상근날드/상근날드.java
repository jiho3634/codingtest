import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = Math.min(Math.min(s.nextInt(), s.nextInt()), s.nextInt());
        int y = Math.min(s.nextInt(), s.nextInt());
        System.out.print(x + y - 50);
        s.close();
    }
}