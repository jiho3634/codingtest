import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[1001][1001];
        int[] area = new int[n];
        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().strip().split(" ");
            int[] in = Arrays.stream(input).mapToInt(Integer::parseInt).toArray();
            for (int j = in[0]; j < in[0] + in[2]; j++) {
                for (int k = in[1]; k < in[1] + in[3]; k++) {
                    if (arr[j][k] > 0) {
                        area[arr[j][k] - 1]--;
                    }
                    arr[j][k] = i + 1;
                    area[i]++;
                }
            }
        }
        for (int i : area) {
            bw.write(String.valueOf(i));
            bw.newLine();
        }
        bw.flush();
        bw.close();
        br.close();
    }
}

