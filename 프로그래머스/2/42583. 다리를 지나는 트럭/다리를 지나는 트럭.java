import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        // 다리를 건너는 트럭들의 무게 합산
        int totalWeightOnBridge = 0;
        // 경과 시간
        int time = 0;
        // 트럭 배열에서 다음에 올라갈 트럭의 인덱스
        int index = 0;

        // 각 트럭이 다리에서 얼마나 남았는지 시간을 관리할 큐
        Queue<Integer> bridge = new LinkedList<>();

        // 트럭이 다리 위에서 다리를 건너기까지의 시간
        Queue<Integer> times = new LinkedList<>();

        while (index < truck_weights.length || !bridge.isEmpty()) {
            time++; // 1초 경과

            // 다리 위에서 트럭이 다 건너면 내리기
            if (!times.isEmpty() && times.peek() == time) {
                totalWeightOnBridge -= bridge.poll();
                times.poll();
            }

            // 다음 트럭이 다리에 올라갈 수 있는지 확인
            if (index < truck_weights.length && totalWeightOnBridge + truck_weights[index] <= weight) {
                // 트럭이 다리에 올라감
                totalWeightOnBridge += truck_weights[index];
                bridge.add(truck_weights[index]);
                // 트럭이 다리를 완전히 건너는 시간을 기록
                times.add(time + bridge_length);
                index++; // 다음 트럭으로 이동
            }
        }

        return time; // 모든 트럭이 다리를 지나기까지 걸린 시간 반환
    }
}
