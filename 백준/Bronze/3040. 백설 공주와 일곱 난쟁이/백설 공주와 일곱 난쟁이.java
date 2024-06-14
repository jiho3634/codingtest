import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // 입력 받기
        int[] dwarfs = new int[9];
        for (int i = 0; i < 9; i++) {
            dwarfs[i] = Integer.parseInt(br.readLine());
        }
        
        // 조합을 찾기 위한 백트래킹 사용
        findSevenDwarfs(dwarfs, new ArrayList<Integer>(), 0, 0);
    }
    
    public static void findSevenDwarfs(int[] dwarfs, List<Integer> selected, int index, int sum) {
        if (selected.size() == 7) { // 7개를 모두 선택했다면
            if (sum == 100) { // 합이 100인지 확인
                Collections.sort(selected); // 결과를 정렬
                for (int number : selected) {
                    System.out.println(number);
                }
                System.exit(0); // 첫 번째로 찾은 결과 출력 후 프로그램 종료
            }
            return;
        }
        
        for (int i = index; i < 9; i++) { // 현재 인덱스부터 탐색 시작
            selected.add(dwarfs[i]); // 난쟁이 선택
            findSevenDwarfs(dwarfs, selected, i + 1, sum + dwarfs[i]); // 다음 난쟁이 선택을 위한 재귀 호출
            selected.remove(selected.size() - 1); // 선택 해제 (백트래킹)
        }
    }
}
