import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int len = s.nextInt();
        int[] numbers = new int[len];
        for (int i = 0; i < len; i++) {
            numbers[i] = s.nextInt();
        }
        int max = -1000000;
        int min = 1000000;
        for (int i = 0; i < len; i++) {
            if (numbers[i] > max)
                max = numbers[i];
            if (numbers[i] < min)
                min = numbers[i];
        }
        System.out.print(min + " " + max);
        s.close();
    }
}
