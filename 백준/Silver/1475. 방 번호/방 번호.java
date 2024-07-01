import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[10];
        while (n > 0) {
            arr[n % 10]++;
            n /= 10;
        }
        arr[9] = arr[6] = (arr[6] + arr[9] + 1) / 2;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < 10; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        bw.write(String.valueOf(max));
        bw.flush();
        bw.close();
        br.close();
    }
}