class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> hm = new HashMap<>();
        for (int num : nums) {
            hm.put(num, hm.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<int[]> queue = new PriorityQueue<>((a, b) -> (b[0] - a[0]));
        for (int key : hm.keySet()) {
            queue.add(new int[]{hm.get(key), key});
        }
        int[] res = new int[k];
        int i = 0;
        while (i < k) {
            int[] element = queue.remove();
            res[i] = element[1];
            i++;
        }
        
        return res;
    }
}
