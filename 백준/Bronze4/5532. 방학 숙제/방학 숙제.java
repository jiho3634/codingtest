import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        int E = A % C == 0 ? A / C : A / C + 1;
        int F = B % D == 0 ? B / D : B / D + 1;
        L = L - (Math.max(E, F));
        System.out.print(L);
        sc.close();
    }
}