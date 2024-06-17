public class Main {
    public static void main(String[] args) {
        var s = new java.util.Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        int cnt = 1;
        int tmp = arr[arr.length - 1];
        for (int i = arr.length - 2; i >= 0; i--) {
            if (tmp < arr[i]) {
                tmp = arr[i];
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}