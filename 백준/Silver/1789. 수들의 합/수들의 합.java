import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        double S = Double.parseDouble(br.readLine());
        bw.write(String.valueOf((long)(Math.sqrt(1 + 8 * S) - 1) / 2));

        bw.flush();
        bw.close();
        br.close();
    }
}