import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        int sum = 0;
        for (int i = 0; i < input.length(); i++) {
            sum = sum * 16 +"0123456789ABCDEF".indexOf(input.charAt(i));
        }
        System.out.println(sum);
    }
}
