import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (s.hasNextLine()) {
            String a = s.nextLine();
            int[] arr = new int[4];
            for (int i = 0; i < a.length(); i++) {
                char c = a.charAt(i);
                if (Character.isLowerCase(c))
                    arr[0]++;
                else if (Character.isUpperCase(c))
                    arr[1]++;
                if (Character.isDigit(c))
                    arr[2]++;
                if (Character.isWhitespace(c))
                    arr[3]++;
            }
            System.out.println(arr[0] + " " + arr[1] + " " + arr[2] + " " + arr[3]);
        }
    }
}