import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a[] = {s.nextInt(), s.nextInt(), s.nextInt()};
        java.util.Arrays.sort(a);
        if (a[2] >= a[1] + a[0])
            a[2] = a[1] + a[0] - 1;
        System.out.println(a[0] + a[1] + a[2]);
    }
}