import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        int cnt = 0;
        for (char c : line.toCharArray()) {
            if ("aeiou".indexOf(c) != -1)
                cnt++;
        }
        System.out.println(cnt);
        sc.close();
    }
}