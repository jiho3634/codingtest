import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 성의 세로 크기
        int M = sc.nextInt(); // 성의 가로 크기
        sc.nextLine(); // 버퍼 비우기

        boolean[] rowGuard = new boolean[N];
        boolean[] colGuard = new boolean[M];

        for (int i = 0; i < N; i++) {
            String line = sc.nextLine();
            for (int j = 0; j < M; j++) {
                if (line.charAt(j) == 'X') {
                    rowGuard[i] = true;
                    colGuard[j] = true;
                }
            }
        }

        // 경비원이 없는 행과 열의 수를 동시에 셈
        int rowCount = 0;
        int colCount = 0;

        for (int i = 0; i < N; i++) {
            if (!rowGuard[i]) {
                rowCount++;
            }
        }

        for (int j = 0; j < M; j++) {
            if (!colGuard[j]) {
                colCount++;
            }
        }

        // 추가해야 하는 경비원의 최솟값 출력
        int result = Math.max(rowCount, colCount);
        System.out.println(result);

        sc.close();
    }
}
