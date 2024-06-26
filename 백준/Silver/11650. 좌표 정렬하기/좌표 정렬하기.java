import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        Set<Integer[]> set = new TreeSet<>((o1, o2) -> {
            if (o1[0].equals(o2[0])) {
                return o1[1].compareTo(o2[1]);
            } else {
                return o1[0].compareTo(o2[0]);
            }
        });

        for (int i = 0; i < n; i++) {
            String[] xy= br.readLine().split(" ");
            set.add(new Integer[]{Integer.parseInt(xy[0]), Integer.parseInt(xy[1])});
        }

        for (Integer[] i : set) {
            bw.write(i[0].toString() + " " + i[1].toString());
            bw.newLine();
        }

        bw.flush();
        bw.close();
        br.close();
    }
}

