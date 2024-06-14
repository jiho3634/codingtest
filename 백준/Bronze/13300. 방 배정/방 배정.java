public class Main {
    public static void main(String[] args) {
        var s = new java.util.Scanner(System.in);
        long n = s.nextInt();
        long k = s.nextInt();
        long sum = 0;
        int[][] arr = new int[2][6];
        for (int i = 0; i < n; i++)
            arr[s.nextInt()][s.nextInt() - 1]++;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j] / k;
                if (arr[i][j] % k > 0) {
                    sum++;
                }
            }
        }
        System.out.println(sum);
    }
}