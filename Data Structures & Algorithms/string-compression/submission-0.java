class Solution {
    public int compress(char[] chars) {
        int left = 0;

        for (int i = 0; i < chars.length;) {
            int count = 0;
            char letter = chars[i];

            while (i < chars.length && chars[i] == letter) {
                i++;
                count++;
            }

            chars[left] = letter;
            left++;

            if (count > 1) {
                String strCount = Integer.toString(count);
                for (int j = 0; j < strCount.length(); j++) {
                    chars[left] = strCount.charAt(j);
                    left++;
                }
            }
        }

        return left;
    }
}