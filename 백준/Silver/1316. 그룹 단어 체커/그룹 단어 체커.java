import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] input = br.readLine().strip().split(" ");
        int n = Integer.parseInt(input[0]);
        int answer = n;
        for (int i = 0; i < n; i++) {
            if (br.readLine().replaceAll("(.)\\1+", "$1").matches(".*(.).*\\1.*"))
                answer--;
        }
        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
        br.close();
    }
}

