import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int two = 0;
        int five = 0;
        for (int i = 0; i < n; i++) {
            int tmp = i + 1;
            while (true) {
                if (tmp % 2 == 0) {
                    two++;
                    tmp /= 2;
                } else if (tmp % 5 == 0) {
                    five++;
                    tmp /= 5;
                } else {
                    break;
                }
            }
        }
        bw.write(String.valueOf(Math.min(two, five)));
        bw.flush();
        bw.close();
        br.close();
    }
}