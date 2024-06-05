import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        int mm = m - 45;
        if (mm < 0) {
            mm = 60 + mm;
            h = h - 1;
            if (h < 0) {
                h = 24 + h;
            }
        }
        System.out.println(h+" "+mm);
    }
}
