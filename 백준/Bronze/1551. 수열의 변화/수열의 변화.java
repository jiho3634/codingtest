import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] input = br.readLine().strip().split(" ");
        int n = Integer.parseInt(input[0]);
        int k = Integer.parseInt(input[1]);
        int[] tmp = Arrays.stream(br.readLine().trim().split(",")).mapToInt(Integer::parseInt).toArray();
        int[] arr;
        for (int i = 0; i < k; i++) {
            arr = tmp.clone();
            tmp = new int[arr.length - 1];
            for (int j = 0; j < tmp.length; j++) {
                tmp[j] = arr[j + 1] - arr[j];
            }
        }
        for (int i = 0; i < tmp.length; i++) {
            bw.write(String.valueOf(tmp[i]));
            if (i != tmp.length - 1) {
                bw.write(",");
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}

