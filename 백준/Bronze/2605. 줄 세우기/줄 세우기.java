import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = Integer.parseInt(s.nextLine().strip());
        List<Integer> arr = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            arr.add(i);
        }
        s.nextInt();
        for (int i = 1; i < n; i++) {
            int tmp = arr.get(i);
            arr.remove(i);
            arr.add(i - s.nextInt(), tmp);
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
        s.close();
    }
}
