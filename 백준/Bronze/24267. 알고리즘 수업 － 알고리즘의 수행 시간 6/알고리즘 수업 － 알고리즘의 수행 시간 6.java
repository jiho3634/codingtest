public class Main {
    public static void main(String[] args) {
        var s = new java.util.Scanner(System.in);
        long n = s.nextInt();
        if (n == 1 || n == 2) {
            System.out.println(0 + "\n" + 3);
            return;
        }
        System.out.println(n * (n - 1) * (n - 2) / 6);
        System.out.println(3);
    }
}