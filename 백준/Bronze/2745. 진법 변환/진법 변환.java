import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.next();
        int n = s.nextInt();
        int sum = 0;
        for (int i = 0; i < input.length(); i++) {
            int num;
            if (Character.isDigit(input.charAt(i)))
                num = input.charAt(i) - '0';
            else
                num = input.charAt(i) - 'A' + 10;
            sum = sum * n + num;
        }
        System.out.println(sum);
    }
}
