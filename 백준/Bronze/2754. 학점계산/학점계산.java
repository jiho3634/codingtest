import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String in = s.nextLine();
        if (in.charAt(0) == 'F') {
            System.out.print(0.0);
            return ;
        }
        double out = 'E' - in.charAt(0);
        if (in.charAt(1) == '+')
            out += 0.3;
        else if (in.charAt(1) == '-')
            out -= 0.3;
        else
            ;
        System.out.print(out);
    }
}
