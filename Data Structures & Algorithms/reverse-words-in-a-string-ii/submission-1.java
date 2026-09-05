class Solution {
    public void reverseWords(char[] s) {
        reverse(s, 0, s.length - 1);
        int i = 0;
        int j = 0;

        while (i < s.length) {
            j = i;
            while (j < s.length && s[j] != ' ') j++;
            reverse(s, i, j - 1);
            i = j + 1;
        }
    }

    public void reverse(char[] s, int left, int right) {
        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }
}
