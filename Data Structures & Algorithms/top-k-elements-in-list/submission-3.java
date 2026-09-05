class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] res = new int[k];
        Map<Integer, Integer> hm = new HashMap<>();
        for (int num : nums) {
            hm.put(num, hm.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<int[]> queue = new PriorityQueue<>((a, b) -> b[1] - a[1]);
        for (int key : hm.keySet()) {
            queue.add(new int[]{key, hm.get(key)});
        }

        for (int i = 0; i < k; i++) {
            int[] value = queue.remove();
            res[i] = value[0]; 
        }

        return res;
    }
}
