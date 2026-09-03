class Solution {
    public String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < prefix.length(); i++) {
            char c = prefix.charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (i >= strs[j].length() || c != strs[j].charAt(i)) {
                    return sb.toString();
                }
            }
            sb.append(c);
        }

        return sb.toString();
    }
}