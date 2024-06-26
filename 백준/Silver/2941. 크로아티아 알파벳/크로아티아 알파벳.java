import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 스캐너를 사용하여 입력을 받습니다.
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        scanner.close();
        
        // 크로아티아 알파벳을 정의합니다.
        String[] croatianAlphabets = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        
        // 주어진 문자열에서 크로아티아 알파벳을 모두 찾고 그 길이를 1로 대체합니다.
        for (String croatian : croatianAlphabets) {
            word = word.replace(croatian, "!");
        }
        
        // 변환된 문자열의 길이를 출력합니다.
        System.out.println(word.length());
    }
}