import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.nextLine();
        for (int i = 0; i < n; i++) {
            String str = s.nextLine();
            System.out.println("" + str.charAt(0) + str.charAt(str.length() - 1));
        }
    }
}
