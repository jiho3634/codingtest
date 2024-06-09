import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        for (int i = sc.nextInt(); i > 0; i--) {
            int n = sc.nextInt();
            System.out.println(sc.next().replaceAll(".", "$0".repeat(n)));
        }
    }
}