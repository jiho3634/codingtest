import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] arr = new int[5];
        String[] lines = br.readLine().strip().split(" ");
        for (int i = 0; i < 5; i++) {
            arr[i] = Integer.parseInt(lines[i]);
        }
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                int g = gcd(Math.max(arr[i], arr[j]), Math.min(arr[i], arr[j]));
                int h = arr[i] * arr[j] / g;
                for (int k = j + 1; k < arr.length; k++) {
                    int m = gcd(Math.max(h, arr[k]), Math.min(h, arr[k]));
                    int l = h * arr[k] / m;
                    if (l < min)
                        min = l;
                }
            }
        }
        bw.write(String.valueOf(min));
        bw.close();
        br.close();
    }
    public static int gcd(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
}