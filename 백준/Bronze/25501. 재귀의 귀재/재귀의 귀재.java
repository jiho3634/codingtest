import java.util.Scanner;

public class Main{
    static int cnt;
    public static int recursion(String s, int l, int r){
        if(l >= r) return 1;
        else if(s.charAt(l) != s.charAt(r)) return 0;
        else {
            cnt++;
            return recursion(s, l+1, r-1);
        }
    }
    public static int isPalindrome(String s){
        cnt++;
        return recursion(s, 0, s.length()-1);
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.nextLine();
        for (int i = 0; i < n; i++) {
            cnt = 0;
            System.out.println(isPalindrome(s.nextLine()) + " " + cnt);
        }
    }
}