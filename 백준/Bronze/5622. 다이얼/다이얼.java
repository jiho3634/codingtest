public class Main {
    public static void main(String[] args) {
        var s = new java.util.Scanner(System.in);
        int t = 0;
        while (s.hasNextLine()) {
            String input = s.nextLine();
            for (char c : input.toCharArray()) {
                if (c == 'Z') c--;
                if (c >= 'S') c--;
                t += (c - 'A') / 3 + 3;
            }
        }
        System.out.print(t);
    }
}