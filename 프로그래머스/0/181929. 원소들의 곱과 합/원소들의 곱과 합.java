class Solution {
    public int solution(int[] num_list) {
        int a = 1;
        int b = 0;
        for (int num : num_list) {
            a *= num;
            b += num;
        }
        return a < b * b ? 1 : 0;
    }
}