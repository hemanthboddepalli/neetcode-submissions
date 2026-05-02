class Solution {
    public int[] productExceptSelf(int[] nums) {
        //[3, 2, 4, 6]
        //[48, 24, 6, 1]
        //[48, 72, 36, 24]

        int[] right = new int[nums.length];

        right[nums.length - 1] = 1;
        for (int i = nums.length - 2; i >= 0; i--) {
            right[i] = right[i + 1] * nums[i + 1];
        }

        int[] res = new int[nums.length];
        int i = 0;
        int product = 1;
        while (i < nums.length) {
            res[i] = product * right[i];
            product *= nums[i];
            i++;
        }

        return res;
    }
}  
