import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        // 프로세스의 우선순위와 인덱스를 저장할 큐를 생성
        Queue<int[]> queue = new LinkedList<>();
        for (int i = 0; i < priorities.length; i++) {
            queue.add(new int[]{priorities[i], i});
        }

        int executionOrder = 0; // 몇 번째로 실행되는지 기록할 변수
        
        while (!queue.isEmpty()) {
            int[] current = queue.poll(); // 큐에서 첫 번째 프로세스를 꺼냄
            boolean hasHigherPriority = false;

            // 큐에 더 높은 우선순위의 프로세스가 있는지 확인
            for (int[] process : queue) {
                if (process[0] > current[0]) {
                    hasHigherPriority = true;
                    break;
                }
            }

            if (hasHigherPriority) {
                // 더 높은 우선순위가 있으면 현재 프로세스를 다시 큐에 넣음
                queue.add(current);
            } else {
                // 현재 프로세스를 실행함
                executionOrder++;
                if (current[1] == location) {
                    // 실행된 프로세스가 목표 위치의 프로세스라면 순서를 반환
                    return executionOrder;
                }
            }
        }

        return executionOrder;
    }
}
