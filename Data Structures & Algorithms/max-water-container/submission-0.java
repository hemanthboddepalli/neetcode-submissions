class Solution {
    public int maxArea(int[] heights) {
        int left = 0, right = heights.length - 1;
        int maxArea = 0;
        while (left < right) {
            int area = (right - left) * Math.min(heights[right], heights[left]);
            if (heights[right] < heights[left]) {
                right--;
            } else {
                left++;
            }
            maxArea = Math.max(maxArea, area);
        }

        return maxArea;
    }
}
