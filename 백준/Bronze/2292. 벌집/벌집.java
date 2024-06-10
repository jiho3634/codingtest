public class Main {
    public static void main(String[] args) {
        var s = new java.util.Scanner(System.in);
        int i = 1, n = s.nextInt() - 1;
        while (n > 0)
            n -= 6 * i++;
        System.out.print(i);
    }
}