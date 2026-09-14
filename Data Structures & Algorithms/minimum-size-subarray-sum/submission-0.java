class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int res = nums.length + 1;
        int left = 0;
        int right = 0;
        int sum = 0;

        while (right < nums.length) {
            sum += nums[right];

            while (sum >= target) {
                res = Math.min(res, right - left + 1);
                sum -= nums[left];
                left++;
            }

            right++;
        }

        return res == nums.length + 1 ? 0 : res;
    }
}