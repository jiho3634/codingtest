import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = Integer.parseInt(s.nextLine());
        String str = s.nextLine();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += Integer.parseInt(Character.toString(str.charAt(i)));
        }
        System.out.print(sum);
        s.close();
    }
}