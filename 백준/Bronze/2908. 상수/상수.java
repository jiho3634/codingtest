public class Main {
    public static void main(String[] args) {
        var s = new java.util.Scanner(System.in);
        String a = new StringBuilder(Integer.toString(s.nextInt())).reverse().toString();
        String b = new StringBuilder(Integer.toString(s.nextInt())).reverse().toString();
        if (a.compareTo(b) > 0)
            System.out.println(a);
        else
            System.out.println(b);
    }
}