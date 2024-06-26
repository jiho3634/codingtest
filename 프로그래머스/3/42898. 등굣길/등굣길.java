import java.util.Arrays;

class Solution {
    public static int solution(int m, int n, int[][] puddles) {
        int[][] arr = new int[n + 1][m + 1];
        for (int[] i : puddles) {
            arr[i[1]][i[0]] = -1;
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (i == 1 && j == 1) {
                    arr[i][j] = 1;
                } else if (arr[i][j] == -1) {
                    arr[i][j] = 0;
                } else {
                    arr[i][j] = (arr[i - 1][j] % 1000000007 + arr[i][j - 1] % 1000000007) % 1000000007;
                }
            }
        }
        return arr[n][m];
    }
}