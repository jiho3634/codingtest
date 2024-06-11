import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int fc = s.nextInt();
        int vc = s.nextInt();
        int p = s.nextInt();
        if (vc == p) {
            System.out.println(-1);
            return ;
        }
        int a = -fc / (vc - p);
        if (a < 0)
            System.out.println(-1);
        else
            System.out.print(a + 1);
    }
}
