import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word1 = scanner.nextLine();
        String word2 = scanner.nextLine();
        int[] count1 = new int[26];
        int[] count2 = new int[26];
        for (char c : word1.toCharArray()) {
            count1[c - 'a']++;
        }
        for (char c : word2.toCharArray()) {
            count2[c - 'a']++;
        }
        int cnt = 0;
        for (int i = 0; i < 26; i++) {
            cnt += Math.abs(count1[i] - count2[i]);
        }
        System.out.println(cnt);
    }
}
