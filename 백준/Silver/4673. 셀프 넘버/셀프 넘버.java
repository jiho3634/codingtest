import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();

        // 1부터 10000까지의 숫자를 TreeSet에 추가합니다.
        for (int i = 1; i <= 10000; i++) {
            numbers.add(i);
        }

        // 각 숫자에 대해 d(n)을 계산하고 TreeSet에서 제거합니다.
        for (int i = 1; i <= 10000; i++) {
            int dn = calculateDn(i);
            numbers.remove(dn);
        }

        // TreeSet에 남아 있는 숫자가 셀프 넘버입니다.
        for (int number : numbers) {
            System.out.println(number);
        }
    }

    // d(n)을 계산하는 메소드
    public static int calculateDn(int n) {
        int sum = n;
        while (n > 0) {
            sum += n % 10;  // 각 자리수를 더합니다.
            n /= 10;
        }
        return sum;
    }
}
