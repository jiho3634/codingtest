class Solution {
    public int solution(int n) {
        int answer = 0;
        if (n % 2 == 1) {
            int k = n / 2 + 1;
            for (int i = 1; i <= k; i++) {
                answer += 2 * i - 1;
            }
            return answer;
        } else {
            int k = n / 2;
            for (int i = 1; i <= k; i++) {
                answer += 4 * i * i;
            }
            return answer;
        }
    }
}