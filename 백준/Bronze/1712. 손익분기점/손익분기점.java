import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int fc = s.nextInt(), vc, p, a;
        if ((vc = s.nextInt()) == (p = s.nextInt()))
            System.out.println(-1);
        else
            System.out.println((a = -fc / (vc - p)) < 0 ? -1 : (a + 1));
    }
}
