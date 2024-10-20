import java.util.Arrays;

class Solution {
    public int solution(int[] nums) {
        int size = nums.length;
        nums = Arrays.stream(nums).distinct().toArray();
        if (nums.length >= size / 2) {
            return size / 2;
        } else {
            return nums.length;
        }
    }
}