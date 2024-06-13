import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int l = s.nextInt();
        s.nextLine();
        String m = s.nextLine();
        long sum = 0;
        long mod = 1234567891;
        long p = 1;

        for (int i = 0; i < l; i++) {
            sum = (sum + (m.charAt(i) - 'a' + 1) * p) % mod;
            p = (p * 31) % mod;
        }
        System.out.println(sum);
    }
}
