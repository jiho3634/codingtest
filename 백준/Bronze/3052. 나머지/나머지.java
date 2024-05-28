import java.util.Scanner;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet<Integer> remainders = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            remainders.add(scanner.nextInt() % 42);
        }
        System.out.println(remainders.size());
        scanner.close();
    }
}
