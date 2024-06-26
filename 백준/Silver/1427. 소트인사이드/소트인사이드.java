import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        Character[] arr = str.chars()
                .mapToObj(c -> (char) c)
                .toArray(Character[]::new);
        Arrays.sort(arr, Collections.reverseOrder());
        String answer = Arrays.stream(arr)
                .map(String::valueOf)
                .collect(Collectors.joining());
        bw.write(answer);
        bw.flush();
        bw.close();
        br.close();
    }
}

