import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int ax = s.nextInt();
        int ay = s.nextInt();
        int az = s.nextInt();
        int cx = s.nextInt();
        int cy = s.nextInt();
        int cz = s.nextInt();
        System.out.print(cx - az);
        System.out.print(" ");
        System.out.print(cy / ay);
        System.out.print(" ");
        System.out.print(cz - ax);
    }
}
