import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Map<String, Integer> map = new HashMap<>();
        Set<Integer> set = new HashSet<>();
        map.put("add", 0);
        map.put("remove", 1);
        map.put("check", 2);
        map.put("toggle", 3);
        map.put("all", 4);
        map.put("empty", 5);
        int n = Integer.parseInt(br.readLine());
        while (n-- > 0) {
            String[] line = br.readLine().split(" ");
            switch (map.get(line[0])) {
                case 0:
                    set.add(Integer.parseInt(line[1]));
                    break;
                case 1:
                    set.remove(Integer.parseInt(line[1]));
                    break;
                case 2:
                    bw.write(set.contains(Integer.parseInt(line[1])) ? "1\n" : "0\n");
                    break;
                case 3:
                    if (set.contains(Integer.parseInt(line[1]))) {
                        set.remove(Integer.parseInt(line[1]));
                    } else {
                        set.add(Integer.parseInt(line[1]));
                    } break;
                case 4:
                    set.addAll(IntStream.rangeClosed(1, 20).boxed().collect(Collectors.toSet()));
                    break;
                case 5:
                    set.clear();
                    break;
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}