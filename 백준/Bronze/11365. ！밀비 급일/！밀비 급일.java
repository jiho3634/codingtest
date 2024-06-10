import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String line = new StringBuilder(sc.nextLine()).reverse().toString();
            if (line.equals("DNE"))
                break;
            System.out.println(line);
        }
        sc.close();
    }
}