import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        for (int i = 0; i < a.length(); i++) {
            int b = a.charAt(i) - '0';
            String tmp = "" + b / 4 + b % 4 / 2 + b % 4 % 2;
            if (i == 0) {
                if (b / 4 == 0) {
                    if (b % 4 / 2 == 0) {
                        tmp = "" + b % 4 % 2;
                    } else {
                        tmp = "" + b % 4 / 2 + b % 4 % 2;
                    }
                }
            }
            System.out.print(tmp);
        }
    }
}
