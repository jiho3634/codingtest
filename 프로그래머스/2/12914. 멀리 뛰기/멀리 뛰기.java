class Solution {
    public static int solution(int n) {
        int MOD = 1234567;
        
        // dp 배열을 초기화합니다.
        int[] dp = new int[n + 1];
        
        // 기저 조건 설정
        dp[1] = 1;
        if (n > 1) {
            dp[2] = 2;
        }
        
        // 점화식을 사용하여 dp 배열을 채웁니다.
        for (int i = 3; i <= n; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2]) % MOD;
        }
        
        // 결과 반환
        return dp[n];
    }
}