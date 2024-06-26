import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        String[] lines = new String[n];
        for (int i = 0; i < n; i++) {
            lines[i] = br.readLine();
        }
        Arrays.sort(lines, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() == o2.length()) {
                    return o1.compareTo(o2);
                }
                return Integer.compare(o1.length(), o2.length());
            }
        });
        List<String> list = Arrays.stream(lines).distinct().collect(Collectors.toList());
        for (String s : list) {
            System.out.println(s);
        }
        bw.flush();
        bw.close();
        br.close();
    }
}

