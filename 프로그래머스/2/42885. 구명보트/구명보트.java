import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        Deque<Integer> deq = new ArrayDeque<>();
        Arrays.sort(people);
        for (int i : people) {
            deq.add(i);
        }
        int answer = 0;
        while (!deq.isEmpty()) {
            answer++;
            int tmp = deq.pollLast();
            if (deq.peekFirst() != null && limit - tmp >= deq.peekFirst()) {
                deq.removeFirst();
            }
        }
        return answer;
    }
}