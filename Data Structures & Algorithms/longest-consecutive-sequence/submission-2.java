class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> hs = new HashSet<>();
        for (int num : nums) {
            hs.add(num);
        }
        
        int maxLength = 0;
        for (int i = 0; i < nums.length; i++) {
            int element = nums[i];
            int length = 0;
            while (hs.contains(element)) {
                length++;
                element++;
            }
            maxLength = Math.max(maxLength, length);
        }

        return maxLength;
    }
}
