import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 81; i++)
            list.add(s.nextInt());
        int max = Collections.max(list);
        int i = list.indexOf(max);
        System.out.print(max + "\n" + (i / 9 + 1) + " " + (i % 9 + 1));
    }
}