import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // N과 X 입력 받기
        int N = scanner.nextInt();
        int X = scanner.nextInt();
        
        // 수열 A 입력 받기
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }
        
        // X보다 작은 수 출력
        for (int i = 0; i < N; i++) {
            if (A[i] < X) {
                System.out.print(A[i] + " ");
            }
        }
        
        scanner.close();
    }
}
