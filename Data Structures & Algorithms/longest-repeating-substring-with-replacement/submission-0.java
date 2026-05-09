class Solution {
    public int characterReplacement(String s, int k) {
        int left = 0, right = 0, result = 0;
        Map<Character, Integer> counter = new HashMap<>();

        while (right < s.length()) {
            char r = s.charAt(right);
            counter.put(r, counter.getOrDefault(r, 0) + 1);
            int maxCounter = Collections.max(counter.values());

            while ((right - left + 1) - maxCounter > k) {
                char l = s.charAt(left);
                counter.put(l, counter.get(l) - 1);
                left++;
            }

            result = Math.max(result, right - left + 1);
            right++;
        }

        return result;
    }
}
