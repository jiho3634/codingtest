import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for (int t = 0; t < T; t++) {
            int H = scanner.nextInt();
            int W = scanner.nextInt();
            int N = scanner.nextInt();
            int floor = (N - 1) % H + 1;
            int room = (N - 1) / H + 1;
            System.out.printf("%d%02d\n", floor, room);
        }
        scanner.close();
    }
}
