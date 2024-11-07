import java.util.ArrayDeque;

class Solution {
    public int[] solution(int[] arr) {
        ArrayDeque<Integer> stk = new ArrayDeque<>();
        int i = 0;
        while (i < arr.length) {
            if (stk.isEmpty()) {
                stk.add(arr[i]);
                i++;
            } else if (stk.getLast() < arr[i]) {
                stk.add(arr[i]);
                i++;
            } else {
                stk.removeLast();
            }
        }
        return stk.stream().mapToInt(Integer::intValue).toArray();
    }
}