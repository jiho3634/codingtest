import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.nextLine();
        int[] arr = new int['z' - 'a' + 1];
        for (int i = 0; i < n; i++) {
            String a = s.nextLine();
            arr[(a.charAt(0) - 'a')]++;
        }
        boolean b = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 5) {
                System.out.print((char)('a' + i));
                b = true;
            }
        }
        if (!b) {
            System.out.println("PREDAJA");
        }
    }
}