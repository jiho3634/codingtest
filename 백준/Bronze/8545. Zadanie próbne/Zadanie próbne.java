import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        StringBuilder str = new StringBuilder(s.nextLine()).reverse();
        System.out.println(str);
    }
}

