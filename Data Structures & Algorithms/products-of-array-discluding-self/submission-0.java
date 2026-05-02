class Solution {
    public int[] productExceptSelf(int[] nums) {
        //[3, 2, 4, 6]
        //[3, 6, 24, 144]
        //[144, 48, 24, 6]
        //[48, 72, 36, 24]
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];

        left[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            left[i] = left[i - 1] * nums[i];
        }

        right[nums.length - 1] = nums[nums.length - 1];
        for (int i = nums.length - 2; i >= 0; i--) {
            right[i] = right[i + 1] * nums[i];
        }

        int[] res = new int[nums.length];
        int i = 0;
        while (i < nums.length) {
            int leftProduct = i - 1 >= 0 ? left[i - 1] : 1;
            int rightProduct = i + 1 < nums.length ? right[i + 1] : 1;

            res[i] = leftProduct * rightProduct;
            i++;
        }

        return res;
    }
}  
