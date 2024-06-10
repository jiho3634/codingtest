import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String n = sc.next();
            int y = sc.nextInt();
            int w = sc.nextInt();
            if (y == 0 && w == 0)
                break ;
            System.out.print(n + " ");
            if (y > 17 || w >= 80)
                System.out.println("Senior");
            else
                System.out.println("Junior");
        }
        sc.close();
    }
}