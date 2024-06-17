import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int d = s.nextInt();
        int h = s.nextInt();
        int w = s.nextInt();
        double a = d / Math.sqrt(h * h + w * w);
        double b = a * h;
        double c = a * w;
        System.out.println((int)Math.floor(b) + " " + (int)Math.floor(c));
        s.close();
    }
}
