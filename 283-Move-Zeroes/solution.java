public class Solution {
    public void moveZeroes(int[] nums) {
        int temp;
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] == 0) {
                temp = nums[i];
                nums[i] = nums[i+1];
                nums[i+1] = temp;
            }
        }
        return nums;
    }
}