import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int l = s.nextInt();
        s.nextLine();
        String m = s.nextLine();
        long sum = 0;
        for (int i = 0; i < l; i++) {
            sum += (m.charAt(i) - 'a' + 1) * (long)Math.pow(31, i);
        }
        long H = sum % 1234567891;
        System.out.println(H);
    }
}
