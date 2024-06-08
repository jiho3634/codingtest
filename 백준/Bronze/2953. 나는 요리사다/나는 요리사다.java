import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = 0, score = 0;
        for (int i = 0; i < 5; i++) {
            int input = s.nextInt() + s.nextInt() + s.nextInt() + s.nextInt();
            if (score < input) {
                score = input;
                num = i + 1;
            }
        }
        System.out.println(num + " " + score);
    }
}