import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int v = s.nextInt();
        int c = 0;

        c++; // c = 1
        v = v - a;

        c += v / (a - b);
        if (v % (a - b) > 0)
            c++;
        System.out.println(c);
        s.close();
    }
}
