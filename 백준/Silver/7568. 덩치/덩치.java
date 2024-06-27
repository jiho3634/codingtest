import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[][] people = new int[n][2];
        int[] ranks = new int[n];
        for (int i = 0; i < n; i++) {
            String[] line = br.readLine().split(" ");
            people[i][0] = Integer.parseInt(line[0]);
            people[i][1] = Integer.parseInt(line[1]);
            ranks[i] = 1;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j && people[i][0] < people[j][0] && people[i][1] < people[j][1]) {
                    ranks[i]++;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int rank : ranks) {
            sb.append(rank).append(" ");
        }
        bw.write(sb.toString().trim());
        bw.flush();
        bw.close();
        br.close();
    }
}
