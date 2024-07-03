public class Main {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        
        int E = scanner.nextInt();
        int S = scanner.nextInt();
        int M = scanner.nextInt();
        
        int year = 1;
        
        while (true) {
            if ((year - E) % 15 == 0 && (year - S) % 28 == 0 && (year - M) % 19 == 0) {
                break;
            }
            year++;
        }
        
        System.out.println(year);
    }
}
