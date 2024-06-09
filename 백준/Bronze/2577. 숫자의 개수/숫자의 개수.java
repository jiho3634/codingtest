import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        int[] arr = new int[10];
        for (char c : Integer.toString(sc.nextInt() * sc.nextInt() * sc.nextInt()).toCharArray())
            arr[c - '0']++;
        for (int i : arr)
            System.out.println(i);
    }
}