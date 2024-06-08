import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        s.close();

        for (int i = 0; i < N; i++) {
            // 출력할 줄의 공백
            for (int j = 0; j < N - i - 1; j++) {
                System.out.print(" ");
            }
            
            // 첫 번째 줄부터 N-1번째 줄까지는 공백과 별 패턴
            if (i != N - 1) {
                System.out.print("*");
                for (int j = 0; j < 2 * i - 1; j++) {
                    System.out.print(" ");
                }
                if (i > 0) {
                    System.out.print("*");
                }
            } else {
                // 마지막 줄은 모두 별
                for (int j = 0; j < 2 * N - 1; j++) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
