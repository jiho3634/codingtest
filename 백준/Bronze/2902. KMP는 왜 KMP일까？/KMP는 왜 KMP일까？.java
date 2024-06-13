import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        for (int i = 0; i < a.length(); i++) {
            if (Character.isUpperCase(a.charAt(i)))
                System.out.print(a.charAt(i));
        }
    }
}
