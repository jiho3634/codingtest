import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(), result = 0;
        for (int i = 0; i < n; i++)
            result = s.nextInt() == 1 ? result + 1 : result - 1;
        System.out.println(result > 0 ? "Junhee is cute!" : "Junhee is not cute!");
    }
}