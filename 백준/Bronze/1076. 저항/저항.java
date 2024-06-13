import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Map<String, Integer> map = new HashMap<>();
        map.put("black", 0);
        map.put("brown", 1);
        map.put("red", 2);
        map.put("orange", 3);
        map.put("yellow", 4);
        map.put("green", 5);
        map.put("blue", 6);
        map.put("violet", 7);
        map.put("grey", 8);
        map.put("white", 9);
        String a = s.nextLine();
        String b = s.nextLine();
        String c = s.nextLine();
        if (a.equals("black") && b.equals("black"))
            System.out.println(0);
        else if (a.equals("black"))
            System.out.println("" + map.get(b) + "0".repeat(map.get(c)));
        else
            System.out.println("" + map.get(a) + map.get(b) + "0".repeat(map.get(c)));
    }
}
