class Solution {
    public void sortColors(int[] nums) {
        int left = 0;
        int right = 0;

        while (right < nums.length) {
            if (nums[right] == 0) {
                nums[right] = nums[left];
                nums[left] = 0;
                left++;
            }
            right++;
        }

        left = nums.length - 1; 
        right = nums.length - 1;
        while (left >= 0) {
            if (nums[left] == 2) {
                nums[left] = nums[right];
                nums[right] = 2;
                right--; 
            }
            left--;
        }
    }
}