public class Main {
    public static void main(String[] args) {
        var s = new java.util.Scanner(System.in);
        int n = s.nextInt();
        System.out.print(func(n));
    }
    public static int func(int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        return func(n - 1) + func(n - 2);
    }
}