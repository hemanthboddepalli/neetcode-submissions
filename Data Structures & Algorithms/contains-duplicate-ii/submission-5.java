class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (countMap.containsKey(nums[i]) && i - countMap.get(nums[i]) <= k) {
                return true;
            }
            countMap.put(nums[i], i);
        }

        return false;
    }
}