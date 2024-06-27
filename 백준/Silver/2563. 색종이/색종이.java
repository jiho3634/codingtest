import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        boolean[][] arr = new boolean[100][100];
        int answer = 0;
        for (int i = 0; i < n; i++) {
            int dx = scanner.nextInt();
            int dy = scanner.nextInt();

            for (int j = dy; j < dy + 10; j++) {
                for (int k = dx; k < dx + 10; k++) {
                    if (!arr[j][k]) {
                        arr[j][k] = true;
                        answer++;
                    }
                }
            }
        }
        System.out.println(answer);
    }
}