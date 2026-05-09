class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0, right = 0, maxLength = 0;
        Set<Character> set = new HashSet<>();
        while (right < s.length()) {
            char r = s.charAt(right);
            while (set.contains(r)) {
                char l = s.charAt(left);
                set.remove(l);
                left++;
            }
            set.add(r);
            maxLength = Math.max(maxLength, right - left + 1);
            right++;
        }
        
        return maxLength;
    }
}
