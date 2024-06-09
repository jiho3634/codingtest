public class Main {
    public static void main(String[] args) {
        var sc = new java.util.Scanner(System.in);
        int[] a = new int[10];
        int n = sc.nextInt() * sc.nextInt() * sc.nextInt();
        for (; n > 0; n /= 10)
            a[n % 10]++;
        for (int i : a)
            System.out.println(i);
    }
}