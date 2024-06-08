import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int i = 0; i < 9; i++)
            n -= s.nextInt();
        System.out.println(n);
    }
}