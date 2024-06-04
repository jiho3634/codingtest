import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.nextLine();
        for (int i = 0; i < n; i++) {
            String str = s.nextLine();
            if (str.length() >= 6 && str.length() <= 9) {
                int j = 0;
                while (j < str.length()) {
                    if (Character.isDigit(str.charAt(j)) || Character.isAlphabetic(str.charAt(j)))
                        j++;
                    else {
                        System.out.println("no");
                        break ;
                    }
                }
                System.out.println("yes");
            }
            else
                System.out.println("no");
        }
    }
}