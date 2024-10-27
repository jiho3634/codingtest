import java.util.Arrays;
class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = arr.clone();
        for (int[] query : queries) {
            for (int j = query[0]; j <= query[1]; j++) {
                if (j % query[2] == 0) {
                    answer[j] += 1;
                }
            }
        }
        for (int[] query : queries) {
            for (int j = query[0]; j <= query[1]; j++) {
                if (j % query[2] == 0) {
                    arr[j] += 1;
                }
            }
        }
        System.out.println(Arrays.toString(answer));
        System.out.println(Arrays.toString(arr));
        return answer;
    }
}