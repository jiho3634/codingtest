import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.next();
        scanner.close();
        
        boolean isEugeneNumber = false;
        
        // 문자열을 1자리부터 n-1자리까지 두 부분으로 나눔
        for (int i = 1; i < number.length(); i++) {
            String leftPart = number.substring(0, i);
            String rightPart = number.substring(i);
            
            if (getProduct(leftPart) == getProduct(rightPart)) {
                isEugeneNumber = true;
                break;
            }
        }
        
        if (isEugeneNumber) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
    
    // 문자열로 주어진 숫자의 각 자릿수의 곱을 계산하는 메소드
    private static long getProduct(String part) {
        long product = 1;
        for (char c : part.toCharArray()) {
            product *= c - '0'; // '0'의 아스키 값을 빼서 실제 숫자로 변환
        }
        return product;
    }
}
