import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        n = (n - 1) % 8 + 1;
        if (n == 1)
            System.out.print(1);
        else if (n == 2 || n == 8)
            System.out.print(2);
        else if (n == 3 || n == 7)
            System.out.print(3);
        else if (n == 4 || n == 6)
            System.out.print(4);
        else
            System.out.print(5);
        sc.close();
    }
}
