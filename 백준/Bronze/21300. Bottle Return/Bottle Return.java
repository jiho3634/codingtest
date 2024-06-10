import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i < 6; i++) {
            sum += s.nextInt();
        }
        System.out.print(sum * 5);
    }
}
