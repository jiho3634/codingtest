import java.util.ArrayList;
class Solution {
    public int[] solution(int l, int r) {
        ArrayList<Integer> answer = new ArrayList<>();
        loop:
        for (int i = l; i <= r; i++) {
            int div = i;
            while (div > 0) {
                if (div % 5 == 0) {
                    div /= 10;
                } else {
                    continue loop;
                }
            }
            answer.add(i);
        }
        if (answer.isEmpty()) {
            return new int[]{-1};
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}