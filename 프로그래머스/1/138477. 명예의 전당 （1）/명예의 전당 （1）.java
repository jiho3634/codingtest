import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;
class Solution {
    public int[] solution(int k, int[] score) {
                Queue<Integer> pq = new PriorityQueue<>();
        int[] answer = new int[score.length];
        for (int i = 0; i < score.length; i++) {
            pq.add(score[i]);
            if (i >= k) {
                pq.poll();
            }
            answer[i] = pq.peek();
        }
        return answer;
    }
}