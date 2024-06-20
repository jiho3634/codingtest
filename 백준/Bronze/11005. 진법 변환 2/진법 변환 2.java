import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] lines = br.readLine().strip().split(" ");
        int n = Integer.parseInt(lines[0]);
        int b = Integer.parseInt(lines[1]);

        String arr = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        List<Character> line = new ArrayList<>();
        while (n > 0) {
            char c = arr.charAt(n % b);
            line.add(0, c);
            n /= b;
        }
        for (Character c : line)
            bw.write(c);
        bw.flush();
        bw.close();
        br.close();
    }
}

