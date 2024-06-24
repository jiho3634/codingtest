import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        while (!isGold(n)) {
            n--;
        }
        bw.write(Integer.toString(n));
        bw.flush();
        bw.close();
        br.close();
    }

    static boolean isGold(int number) {
        String line = Integer.toString(number);
        for (char c : line.toCharArray()) {
            if (c != '4' && c != '7') {
                return false;
            }
        }
        return true;
    }
}
