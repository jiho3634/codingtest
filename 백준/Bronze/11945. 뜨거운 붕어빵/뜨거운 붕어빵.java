import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        if (N == 0) {
            scanner.close();
            return; // 더 이상 실행할 필요가 없으므로 종료
        }
        scanner.nextLine(); // 줄바꿈 문자 처리
        for (int i = 0; i < N; i++) {
            if (!scanner.hasNextLine()) {
                System.out.println("Insufficient input.");
                break;
            }
            String line = scanner.nextLine();
            StringBuilder reversed = new StringBuilder();
            for (int j = M - 1; j >= 0; j--) {
                reversed.append(line.charAt(j));
            }
            System.out.println(reversed.toString());
        }

        scanner.close();
    }
}
