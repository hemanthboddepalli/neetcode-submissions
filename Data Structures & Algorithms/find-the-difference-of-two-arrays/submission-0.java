class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> res = new ArrayList<>();
        res.add(findDiff(nums1, nums2));
        res.add(findDiff(nums2, nums1));
        return res;
    }

    private List<Integer> findDiff(int[] nums1, int[] nums2) {
        Set<Integer> hs = new HashSet<>();
        for (int num : nums2) {
            hs.add(num);
        }

        Set<Integer> res = new HashSet<>();
        for (int num : nums1) {
            if (!hs.contains(num)) {
                res.add(num);
            }
        }

        return new ArrayList<>(res);
    }
}