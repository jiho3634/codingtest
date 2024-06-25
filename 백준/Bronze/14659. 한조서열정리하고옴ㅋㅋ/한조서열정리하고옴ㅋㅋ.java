import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] arr = Arrays.stream(br.readLine().strip().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        br.close();
        for (int i = 0; i < n; i++) {
            int cnt = 0;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] < arr[j])
                    break;
                else if (arr[i] > arr[j]) {
                    cnt++;
                }
            }
            arr[i] = cnt;
        }
        int max = 0;
        for (int cnt : arr) {
            if (max < cnt) {
                max = cnt;
            }
        }
        bw.write(String.valueOf(max));
        bw.flush();
        bw.close();
   }
}
