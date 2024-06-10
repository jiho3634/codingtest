class Solution {
    public int[] solution(int[] numbers) {
        int len = numbers.length;
        int[] arr = new int[len * (len - 1) / 2];
        int index = 0;
        for (int i = 0; i < len - 1; i++) {
            for (int j = i + 1; j < len; j++) {
                int n = numbers[i] + numbers[j];
                if (index == 0) {
                    arr[index] = n;
                    index++;
                }
                else {
                    for (int k = 0; k < index; k++) {
                        if (arr[k] == n) {
                            break;
                        }
                        if (k == index - 1) {
                            arr[index] = n;
                            index++;
                        }
                    }
                }
            }
        }
        int[] answer = java.util.Arrays.copyOfRange(arr, 0, index);
        java.util.Arrays.sort(answer);
        return answer;
    }
}