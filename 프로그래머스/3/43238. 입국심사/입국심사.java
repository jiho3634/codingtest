import java.util.*;
class Solution {
    public static long solution(int n, int[] times) {

        Arrays.sort(times);

        long left = times[0];
        long right = (long) times[times.length - 1] * n;
        long answer = 0;

        while (left <= right) {
            long mid = (left + right) / 2;
            long sum = 0;

            for (int time : times) {
                sum += mid / time;
            }

            if(sum >= n) {
                answer = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return answer;
    }
}