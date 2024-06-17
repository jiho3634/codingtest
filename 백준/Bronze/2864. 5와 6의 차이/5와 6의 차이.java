public class Main {
    public static void main(String[] args) {
        var s = new java.util.Scanner(System.in);
        char[] a = s.next().toCharArray();
        char[] b = s.next().toCharArray();
        s.nextLine();
        int max_a = 0;
        int min_a = 0;
        for (char c : a) {
            if (c == '5' || c == '6') {
                min_a = min_a * 10 + 5;
                max_a = max_a * 10 + 6;
            } else {
                min_a = min_a * 10 + (c - '0');
                max_a = max_a * 10 + (c - '0');
            }
        }
        int max_b = 0;
        int min_b = 0;
        for (char c : b) {
            if (c == '5' || c == '6') {
                min_b = min_b * 10 + 5;
                max_b = max_b * 10 + 6;
            } else {
                min_b = min_b * 10 + (c - '0');
                max_b = max_b * 10 + (c - '0');
            }
        }
        System.out.println((min_a + min_b) + " " + (max_a + max_b));
    }
}