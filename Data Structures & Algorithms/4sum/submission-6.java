class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();

        for (int i = 0; i < nums.length - 3; i++) {
            if (i == 0 || nums[i] != nums[i - 1]) {
                for (int j = i + 1; j < nums.length - 2; j++) {
                    if (j == i + 1 || nums[j] != nums[j - 1]) {
                        int k = j + 1;
                        int l = nums.length - 1;
                        while (k < l) {
                            long sum = (long)nums[i] + nums[j] + nums[k] + nums[l];
                            
                            if (sum == target) {
                                List<Integer> subRes = new ArrayList<>();
                                subRes.add(nums[i]); 
                                subRes.add(nums[j]); 
                                subRes.add(nums[k]); 
                                subRes.add(nums[l]);

                                res.add(subRes);

                                k++;
                                l--;

                                while (k < l && nums[k] == nums[k - 1]) {
                                    k++;
                                }

                                while (k < l && nums[l] == nums[l + 1]) {
                                    l--;
                                }
                            } else if (sum < target) {
                                k++;
                            } else {
                                l--;
                            }
                        }
                    }
                }
            }
        }

        return res;
    }
}