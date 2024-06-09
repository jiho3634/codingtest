public class Main {
    public static void main(String[] args) {
        var sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0, j = 0, k = 0; i < n; i++, j = 0, k = 0) {
            for (char c : sc.nextLine().toCharArray()) {
                if (c == 'O') {
                    j++;
                    k += j;
                }
                else
                    j = 0;
            }
            System.out.println(k);
        }
    }
}