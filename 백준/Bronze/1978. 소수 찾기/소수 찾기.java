public class Main {
    public static void main(String[] args) {
        var s = new java.util.Scanner(System.in);
        int n = s.nextInt();
        int a = 0;
        loop1:
        for (int i = 0; i < n; i++) {
            int m = s.nextInt();
            if (m == 1)
                continue ;
            for (int j = 2; j < m; j++) {
                if (m % j == 0)
                    continue loop1;
            }
            a++;
        }
        System.out.print(a);
    }
}