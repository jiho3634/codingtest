import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int max = 0;
        int sum = 0;
        while (s.hasNextInt()) {
            sum = sum - s.nextInt() + s.nextInt();
            if (max < sum)
                max = sum;
        }
        System.out.println(max);
    }
}