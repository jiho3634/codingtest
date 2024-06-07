import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String ip = s.nextLine();
        for (int i = 0; i * 10 < ip.length(); i++) {
            int start = i * 10;
            int end = (i + 1) * 10;
            if (end > ip.length())
                end = ip.length();
            System.out.println(ip.substring(start, end));
        }
    }
}