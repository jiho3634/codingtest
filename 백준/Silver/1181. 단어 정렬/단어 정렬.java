import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        Set<String> set = new TreeSet<>((o1, o2) -> {
            if (o1.length() == o2.length()) {
                return o1.compareTo(o2);
            }
            return Integer.compare(o1.length(), o2.length());
        });

        for (int i = 0; i < n; i++) {
            set.add(br.readLine());
        }

        for (String s : set) {
            System.out.println(s);
        }
        bw.flush();
        bw.close();
        br.close();
    }
}

