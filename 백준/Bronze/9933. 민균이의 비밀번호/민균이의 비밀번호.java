import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        List<String> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(br.readLine());
        }
        for (int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder(list.get(i));
            sb.reverse();
            if (list.contains(sb.toString())) {
                bw.write(String.valueOf(sb.length()));
                bw.newLine();
                bw.write(sb.charAt(sb.length() / 2));
                bw.flush();
                bw.close();
                br.close();
                return ;
            }
        }
    }
}

