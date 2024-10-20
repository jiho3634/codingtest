import java.util.Stack;

class Solution {
    public int[] solution(int[] prices) {
        int n = prices.length;
        int[] answer = new int[n];  // 결과 배열
        Stack<Integer> stack = new Stack<>();  // 인덱스를 저장할 스택

        for (int i = 0; i < n; i++) {
            // 가격이 떨어지는 구간 발견 시 처리
            while (!stack.isEmpty() && prices[stack.peek()] > prices[i]) {
                int idx = stack.pop();
                answer[idx] = i - idx;
            }
            stack.push(i);
        }

        // 스택에 남은 인덱스들은 끝까지 가격이 떨어지지 않은 경우 처리
        while (!stack.isEmpty()) {
            int idx = stack.pop();
            answer[idx] = n - idx - 1;
        }

        return answer;
    }
}
