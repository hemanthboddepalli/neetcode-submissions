class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> hm = new HashMap<>();
        for (char c : s.toCharArray()) {
            hm.put(c, hm.getOrDefault(c, 0) + 1);
        }

        for (char c : t.toCharArray()) {
            if (hm.containsKey(c) && hm.get(c) > 0) {
                hm.put(c, hm.get(c) - 1);
                if (hm.get(c) == 0) {
                    hm.remove(c);
                }
            } else {
                return false;
            }
        }

        return hm.size() == 0;
    }
}
