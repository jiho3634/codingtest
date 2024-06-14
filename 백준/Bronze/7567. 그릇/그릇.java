import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        int sum = 10;
        for (int i = 1; i < a.length(); i++) {
            if (a.charAt(i) != a.charAt(i - 1))
                sum += 10;
            else 
                sum += 5;
        }
        System.out.println(sum);
    }
}
