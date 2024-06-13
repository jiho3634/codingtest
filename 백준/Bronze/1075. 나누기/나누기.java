import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        long N = scanner.nextLong();
        int F = scanner.nextInt();
        
        // 마지막 두 자리를 00으로 설정한 기본값을 만듭니다.
        long base = (N / 100) * 100;

        int result = 0;
        
        // 00부터 99까지 순회하며 N이 F로 나누어 떨어지는지 확인합니다.
        for (int i = 0; i < 100; i++) {
            if ((base + i) % F == 0) {
                result = i;
                break;
            }
        }
        
        // 두 자리로 출력하기 위해 포맷을 사용합니다.
        System.out.printf("%02d\n", result);
    }
}
