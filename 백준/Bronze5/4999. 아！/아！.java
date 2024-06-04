import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String b = scanner.nextLine();
        if (a.length() >= b.length())
            System.out.print("go");
        else
            System.out.print("no");
    }
}
