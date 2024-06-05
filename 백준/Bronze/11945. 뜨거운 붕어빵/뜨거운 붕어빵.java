import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int M = scan.nextInt();
        while(scan.hasNext()) {
            StringBuffer sb = new StringBuffer(scan.next());
            String r = sb.reverse().toString();
            System.out.println(r);
        }
        scan.close();
    }
}