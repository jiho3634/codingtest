import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public static int solution(int[] numbers, int target) {
        Queue<Integer> list = new LinkedList<>();
        list.add(numbers[0]);
        list.add(-numbers[0]);
        for (int i = 1; i < numbers.length; i++) {
            for (int j = 0; j < Math.pow(2, i); j++) {
                int tmp = list.poll();
                list.add(tmp + numbers[i]);
                list.add(tmp - numbers[i]);
            }
        }
        int answer = 0;
        for (int i : list) {
            if (i == target) {
                answer++;
            }
        }
        return answer;
    }
}