import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println(Long.parseUnsignedLong(s.next() + s.next()) + Long.parseUnsignedLong(s.next() + s.next()));
    }
}