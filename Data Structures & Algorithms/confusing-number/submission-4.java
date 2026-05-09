class Solution {
    public boolean confusingNumber(int n) {
        int[] digits = new int[10];
        Arrays.fill(digits, -1);
        digits[0] = 0; digits[1] = 1; digits[6] = 9; digits[8] = 8; digits[9] = 6;
        int copyN = n;
        int rotatedN = 0;

        while (copyN > 0) {
            int res = copyN % 10;
            if (digits[res] == -1) {
                return false;
            }
            rotatedN = rotatedN * 10 + digits[res];
            copyN = copyN / 10;
        }

        return n != rotatedN;
    }
}
