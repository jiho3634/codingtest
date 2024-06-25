import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Map;
import java.util.TreeMap;

public class Main {

    private static boolean solveAnagrams(String first, String second ) {
            Map<Character, Integer> map1 = new TreeMap<>();
            for (char c : first.toCharArray()) {
                map1.put(c, map1.getOrDefault(c, 0) + 1);
            }
            Map<Character, Integer> map2 = new TreeMap<>();
            for (char c : second.toCharArray()) {
                map2.put(c, map2.getOrDefault(c, 0) + 1);
            }
            if (!map1.equals(map2)) {
                return false;
            }
            return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numTests = sc.nextInt();

        for (int i = 0; i < numTests; i++) {
            String first = sc.next().toLowerCase();
            String second = sc.next().toLowerCase();

            System.out.println(first + " & " + second + " are " + (solveAnagrams(first, second) ? "anagrams." : "NOT anagrams."));
        }
    }
}
