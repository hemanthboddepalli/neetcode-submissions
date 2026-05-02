class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> hm = new HashMap<>();
        int max = 0;
        for (int num : nums) {
            int frequency = hm.getOrDefault(num, 0) + 1;
            hm.put(num, frequency);
            max = Math.max(max, frequency);
        }

        List<Integer>[] buckets = new List[max + 1];
        for (int key : hm.keySet()) {
            int frequency = hm.get(key);

            if (buckets[frequency] == null) {
                buckets[frequency] = new ArrayList<>();
            }

            buckets[frequency].add(key);
        }

        int[] res = new int[k];
        int i = 0;
        for (int j = max; j > 0 && i < k; j--) {
            if (buckets[j] != null) {
                for (int value : buckets[j]) {
                    res[i++] = value;
                    if (i == k) {
                        return res;
                    }
                }
            }
        }
        
        return res;
    }
}
