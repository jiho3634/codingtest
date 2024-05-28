import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] numbers = new int[9];
        for (int i = 0; i < 9; i++) {
            numbers[i] = s.nextInt();
        }
        int max = 0;
        int idx = 0;
        for (int i = 0; i < 9; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
                idx = i;
            }
        }
        System.out.println(max);
        System.out.println(idx + 1);
        s.close();
    }
}
