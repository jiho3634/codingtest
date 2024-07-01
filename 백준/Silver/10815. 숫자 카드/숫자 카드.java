import java.io.*;
import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        Set<Integer> sangeun = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).boxed().collect(Collectors.toSet());
        int m = Integer.parseInt(br.readLine());
        int[] jeongsoo = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        loop:
        for (int i = 0; i < m; i++) {
            if (sangeun.contains(jeongsoo[i])) {
                bw.write("1 ");
                continue loop;
            }
            bw.write("0 ");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}