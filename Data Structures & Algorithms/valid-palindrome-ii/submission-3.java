class Solution {
    public boolean validPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        boolean isReplaced = false;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                if (checkIfPalindrome(left, right - 1, s) || checkIfPalindrome(left + 1, right, s)) {
                    return true;
                }
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    private boolean checkIfPalindrome(int left, int right, String s) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}