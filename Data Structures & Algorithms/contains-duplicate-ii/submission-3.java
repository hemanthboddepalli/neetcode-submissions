class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> hs = new HashSet<>();
        int j = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i - j > k) {
                hs.remove(nums[j]);
                j++;
            }
            if (hs.contains(nums[i])) {
                return true;
            }
            hs.add(nums[i]);
        }

        return false;
    }
}