import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int len = s.nextInt();
        int[] numbers = new int[len];
        for (int i = 0; i < len; i++) {
            numbers[i] = s.nextInt();
        }
        int v = s.nextInt();
        int count = 0;
        for (int number : numbers) {
            if (number == v)
                count++;
        }
        System.out.println(count);
        s.close();
    }
}
