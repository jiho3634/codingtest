import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        s.nextLine();
        String str = s.nextLine();
        String aeiou = "aeiou";
        int cnt = 0;
        for (int i = 0; i < a; i++) {
            if (aeiou.contains(Character.toString(str.charAt(i))))
                cnt++;
        }
        System.out.print(cnt);
    }
}
