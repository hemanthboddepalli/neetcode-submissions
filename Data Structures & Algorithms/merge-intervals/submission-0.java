class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(i -> i[0]));

        List<int[]> result = new ArrayList<>();
        int[] currentInterval = intervals[0];
        result.add(currentInterval);

        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] <= currentInterval[1]) {
                currentInterval[1] = Math.max(currentInterval[1], intervals[i][1]);
            } else {
                currentInterval = intervals[i];
                result.add(currentInterval);
            }
        }

        return result.toArray(new int[result.size()][]);
    }
}
