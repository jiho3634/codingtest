import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char input = s.next().charAt(0);
        if (input == 'n' || input == 'N') {
            System.out.println("Naver D2");
        }
        else {
            System.out.println("Naver Whale");
        }
    }
}