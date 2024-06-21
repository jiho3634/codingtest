import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            TreeMap<Integer, String> map = new TreeMap<>();
            for (int j = 0; j < n; j++) {
                String[] line = br.readLine().strip().split(" ");
                map.put(Integer.parseInt(line[1]), line[0]);
            }
            bw.write(map.get(map.lastKey()));
            bw.newLine();
            bw.flush();
        }
        bw.close();
        br.close();
    }
}