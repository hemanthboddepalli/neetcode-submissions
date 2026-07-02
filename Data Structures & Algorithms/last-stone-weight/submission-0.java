class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        for (int stone : stones) {
            queue.add(stone);
        }

        while (queue.size() > 1) {
            int a = queue.remove();
            int b = queue.remove();
            int diff = Math.abs(a - b);
            if (diff > 0) {
                queue.add(diff);
            }
        }

        return queue.isEmpty() ? 0 : queue.peek();
    }
}
