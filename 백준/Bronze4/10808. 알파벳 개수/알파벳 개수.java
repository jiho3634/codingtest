import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        int[] az = new int['z' - 'a' + 1];
        for (int i = 0; i < input.length(); i++) {
            az[input.charAt(i) - 'a']++;
        }
        for (int element : az) {
            System.out.print(element + " ");
        }
        s.close();
    }
}