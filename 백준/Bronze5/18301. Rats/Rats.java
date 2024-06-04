import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n1 = s.nextInt();
        int n2 = s.nextInt();
        int n12 = s.nextInt();
        System.out.print((int)Math.floor((n1 + 1)*(n2 + 1)/(n12 + 1) - 1));
    }
}
