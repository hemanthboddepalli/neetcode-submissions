class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        int i = 0;
        List<List<Integer>> res = new ArrayList<>();
        
        while (i < nums.length - 3) {
            if (i == 0 || nums[i] != nums[i - 1]) {
                int j = i + 1;
                while (j < nums.length - 2) {
                    if (j == i + 1 || nums[j] != nums[j - 1]) {
                        int k = j + 1, l = nums.length - 1;
                        while (k < l) {
                            long sum = (long)nums[i] + (long)nums[j] + (long)nums[k] + (long)nums[l];
                            if (sum == target) {
                                res.add(Arrays.asList(nums[i], nums[j], nums[k], nums[l]));
                                k++; l--;
                                while (k < l && nums[k] == nums[k-1]) {
                                    k++;
                                }
                                while (k < l && nums[l] == nums[l+1]) {
                                    l--;
                                }
                            } else if (sum < target) {
                                k++;
                            } else {
                                l--;
                            }
                        }
                    }
                    j++;
                }
            }
            i++;
        }

        return res;
    }
}