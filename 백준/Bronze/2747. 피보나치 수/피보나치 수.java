public class Main {
    public static void main(String[] args) {
        var s = new java.util.Scanner(System.in);
        int n = s.nextInt();
        int a = 0;
        int b = 1;
        int c = 1;
        if (n == 0) {
            System.out.println(0);
            return;
        }
        else if (n == 1) {
            System.out.println(1);
            return ;
        }
        for (int i = 2; i < n; i++) {
            a = b;
            b = c;
            c = a + b;
        }
        System.out.println(c);
    }
}