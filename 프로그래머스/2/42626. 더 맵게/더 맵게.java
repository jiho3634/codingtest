import java.util.PriorityQueue;
import java.util.Queue;
class Solution {
    public int solution(int[] scoville, int K) {
        Queue<Integer> sq = new PriorityQueue<>();
        for (int i = 0; i < scoville.length; i++) {
            sq.add(scoville[i]);
        }
        int answer = 0;
        while (sq.peek() < K) {
            if (sq.size() < 2)
                return -1;
            Integer i = sq.poll();
            Integer j = sq.poll();
            sq.add(i + j * 2);
            answer++;
        }
        return answer;
    }
}