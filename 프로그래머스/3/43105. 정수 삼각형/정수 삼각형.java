class Solution {
    public static int solution(int[][] triangle) {
        for (int i = 1; i < triangle.length; i++) {
            for (int j = 0; j < triangle[i].length; j++) {
                if (j == 0) {
                    triangle[i][j] += triangle[i - 1][j];
                } else if (j == i) {
                    triangle[i][j] += triangle[i - 1][i - 1];
                } else {
                    triangle[i][j] += Math.max(triangle[i - 1][j - 1], triangle[i - 1][j]);
                }
            }
        }
        int answer = Integer.MIN_VALUE;
        for (int i : triangle[triangle.length - 1]) {
            if (answer < i) {
                answer = i;
            }
        }
        return answer;
    }
}