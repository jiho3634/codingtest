import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        if (m == 1 || m == 2)
            System.out.print("NEWBIE!");
        else if (m <= n)
            System.out.print("OLDBIE!");
        else
            System.out.print("TLE!");
        sc.close();
    }
}
