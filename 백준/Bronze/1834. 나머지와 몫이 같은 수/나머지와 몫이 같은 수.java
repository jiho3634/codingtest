import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] numbers = br.readLine().strip().split(" ");
        long n = Long.parseLong(numbers[0]);
        long sum = n * (n + 1) / 2 - n;
        long answer = sum * n + sum;
        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
        br.close();
    }
}
