import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] numbers = new int[30];
        for (int idx = 0; idx < 28; idx++) {
            numbers[s.nextInt() - 1] = 1;
        }
        for (int idx = 0; idx < 30; idx++) {
            if (numbers[idx] == 0)
                System.out.println(idx + 1);
        }
        s.close();
    }
}
