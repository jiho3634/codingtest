import java.util.Arrays;
import java.util.Stack;
class Solution {
    public static int[] solution(int[] sequence, int k) {
        Stack<int[]> stack = new Stack<>();
        int start = 0;
        int end = 0;
        int sum = sequence[0];
        int min = Integer.MAX_VALUE;
        while (start <= end && end < sequence.length) {
            if (sum == k) {
                if (min > end - start) {
                    min = end - start;
                    if (!stack.isEmpty())
                        stack.pop();
                    stack.push(new int[]{start, end});
                }
                sum -= sequence[start];
                start ++;
            } else if (sum < k && end < sequence.length - 1) {
                end ++;
                sum += sequence[end];
            } else {
                sum -= sequence[start];
                start++;
            }
        }
        int[] answer = stack.pop();
        return answer;
    }
}