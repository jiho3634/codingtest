import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());

        // 반복되는 나머지를 찾기 위한 자료구조
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        int current = N;

        while (!map.containsKey(current)) {
            map.put(current, count++);
            current = (current * N) % P;
        }

        // 반복되는 부분의 서로 다른 수의 개수 계산
        int start = map.get(current);
        int result = count - start;

        System.out.println(result);
    }
}
