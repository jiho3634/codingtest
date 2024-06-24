import java.util.PriorityQueue;
import java.util.Comparator;


class Solution {
    public long solution(int n, int[] works) {
                PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Comparator.reverseOrder());

        for (int i : works) {
            priorityQueue.add(i);
        }
        for (int i = 0; i < n; i++) {
            int tmp = priorityQueue.poll();
            if (tmp > 0)
                tmp--;
            priorityQueue.add(tmp);
        }

        long answer = 0;
        for (int i : priorityQueue) {
            answer += i * i;
        }
        return answer;
    }
}