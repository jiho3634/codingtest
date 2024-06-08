import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int min_x = 10000, min_y = 10000, max_x = -10000, max_y = -10000;
        for (int i = 0; i < n; i++) {
            int x = s.nextInt();
            int y = s.nextInt();
            if (x < min_x)
                min_x = x;
            if (x > max_x)
                max_x = x;
            if (y < min_y)
                min_y = y;
            if (y > max_y)
                max_y = y;
        }
        System.out.println((max_x - min_x) * (max_y - min_y));
    }
}