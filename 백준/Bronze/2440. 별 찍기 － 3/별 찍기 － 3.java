import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = Integer.parseInt(s.nextLine());
        for (; n > 0; n--) {
            System.out.printf("%s\n", "*".repeat(n));
        }
        s.close();
    }
}