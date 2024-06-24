import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt(); // 테스트 케이스의 수 입력 받기
        int[] results = new int[T];
        
        // 각 테스트 케이스 처리
        for (int i = 0; i < T; i++) {
            int N = scanner.nextInt();
            int M = scanner.nextInt();
            results[i] = countZeros(N, M);
        }
        
        // 결과 출력
        for (int result : results) {
            System.out.println(result);
        }
        
        scanner.close();
    }
    
    // N부터 M까지의 숫자에서 0의 개수를 세는 함수
    public static int countZeros(int N, int M) {
        int count = 0;
        for (int number = N; number <= M; number++) {
            count += countZerosInNumber(number);
        }
        return count;
    }
    
    // 주어진 숫자에서 0의 개수를 세는 함수
    public static int countZerosInNumber(int number) {
        int count = 0;
        if (number == 0) return 1; // 숫자가 0인 경우 1을 반환
        
        while (number > 0) {
            if (number % 10 == 0) {
                count++;
            }
            number /= 10; // 다음 자리 숫자로 이동
        }
        return count;
    }
}
