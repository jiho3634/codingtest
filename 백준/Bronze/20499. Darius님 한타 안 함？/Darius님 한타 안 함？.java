import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] numbers = input.split("/");
        int a = Integer.parseInt(numbers[0].trim()); // trim()으로 공백 제거
        int b = Integer.parseInt(numbers[1].trim());
        int c = Integer.parseInt(numbers[2].trim());
        if (a + c < b || b == 0)
            System.out.print("hasu");
        else
            System.out.print("gosu");
        sc.close();
    }
}
