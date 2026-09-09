class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int left = 0;
        int right = 0;
        int res = 0;
        int count = 1;

        while (right < nums.length) {
            if (nums[right] == 0) {
                count--;
            }
            while (count < 0) {
                if (nums[left] == 0) {
                    count++;
                }
                left++;
            }

            res = Math.max(res, right - left + 1);
            right++;
        }

        return res;
    }
}
