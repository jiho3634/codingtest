import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] arr = Arrays.stream(s.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        if (arr[0] == 1) {
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] + 1 != arr[i + 1]) {
                    System.out.println("mixed");
                    return;
                }
            }
            System.out.println("ascending");
        }
        else if (arr[0] == 8) {
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] - 1 != arr[i + 1]) {
                    System.out.println("mixed");
                    return;
                }
            }
            System.out.println("descending");
        }
        else
            System.out.println("mixed");
    }
}
