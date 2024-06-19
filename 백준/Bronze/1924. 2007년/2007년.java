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

        String[] line = br.readLine().strip().split(" ");
        int m = Integer.parseInt(line[0]);
        int d = Integer.parseInt(line[1]);
        int[] arr = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] week = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        int sum = 0;
        for (int i = 0; i < m - 1; i++) {
            sum += arr[i];
        }
        sum += d;
        System.out.println(week[sum % 7]);

        bw.flush();
        bw.close();
        br.close();
    }
}
