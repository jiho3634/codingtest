public class Main {
    public static void main(String[] args) {
        var s = new java.util.Scanner(System.in);
        int n = s.nextInt();
        int min = 0;
        for (int i = n - 1; i > 0; i--) {
            int tmp = func(i);
            if (tmp + i == n)
                min = i;
        }
        System.out.print(min);
    }

    public static int func(int n) {
        int a = 0;
        while (n > 0) {
            a += n % 10;
            n /= 10;
        }
        return a;
    }
}