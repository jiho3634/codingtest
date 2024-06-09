public class Main {
    public static void main(String[] args) {
        var s = new java.util.Scanner(System.in);
        int n = s.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = s.nextInt();
        java.util.Arrays.sort(a);
        for (int i : a)
            System.out.println(i);
    }
}