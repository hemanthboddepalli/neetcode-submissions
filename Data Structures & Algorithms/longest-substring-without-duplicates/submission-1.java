class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int right = 0;
        int res = 0;
        Set<Character> hs = new HashSet<>();

        while (right < s.length()) {
            char c = s.charAt(right);

            while (hs.contains(c)) {
                char t = s.charAt(left);
                hs.remove(t);
                
                left++;
            }

            hs.add(c);
            res = Math.max(res, right - left + 1);
            right++;
        }

        return res;
    }
}
