import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] a = s.nextLine().trim().split(" ");
        if (a[0].isEmpty())
            System.out.println(0);
        else
            System.out.println(a.length);
    }
}