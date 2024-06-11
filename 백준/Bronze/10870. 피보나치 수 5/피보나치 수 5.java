public class Main {
    public static void main(String[] args) {
        var s = new java.util.Scanner(System.in);
        int n = s.nextInt();
        int result = 0;
        if (n == 1)
            result = 1;
        int a = 0;
        int b = 1;
        for (int i = 2; i <= n; i++) {
            result = a + b;
            a = b;
            b = result;
        }
        System.out.print(result);
    }
}