class Solution {
    public int majorityElement(int[] nums) {
        int value = nums[0];
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == value) {
                count++;
            } else if (count == 0) {
                value = nums[i];
            } else {
                count--;
            }
        }
        return value;
    }
}