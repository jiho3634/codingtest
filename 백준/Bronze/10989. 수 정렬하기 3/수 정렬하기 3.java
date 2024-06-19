import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        // 입력을 빠르게 받기 위해 BufferedReader 사용
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 첫 줄에서 수의 개수 N 읽기
        int N = Integer.parseInt(br.readLine());
        
        // N개의 수를 저장할 배열 생성
        int[] numbers = new int[N];
        
        // N개의 수를 배열에 입력
        for (int i = 0; i < N; i++) {
            numbers[i] = Integer.parseInt(br.readLine());
        }
        
        // 배열을 오름차순으로 정렬
        Arrays.sort(numbers);
        
        // 정렬된 배열을 출력
        for (int number : numbers) {
            bw.write(String.valueOf(number));
            bw.newLine();
        }
        
        // BufferedWriter를 닫아 출력 완료
        bw.flush();
        bw.close();
        br.close();
    }
}
