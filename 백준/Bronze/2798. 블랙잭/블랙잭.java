public class Main {
    public static void main(String[] args) {
        var s = new java.util.Scanner(System.in);

        int n = s.nextInt();
        int m = s.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = s.nextInt();

        s.close();

        int sum = 0;
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    int tmp = arr[i] + arr[j] + arr[k];
                    if (tmp <= m && tmp > sum)
                        sum = tmp;
                }
            }
        }
        System.out.print(sum);
    }
}