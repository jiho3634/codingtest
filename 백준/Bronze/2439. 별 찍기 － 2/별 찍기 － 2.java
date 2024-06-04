import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();  // 사용자로부터 N 입력 받음
        for (int i = 1; i <= N; i++)
            System.out.printf("%" + N + "s\n", "*".repeat(i));
        scanner.close();
    }
}