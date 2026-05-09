class Solution {
    public boolean validWordSquare(List<String> words) {
        for (int row = 0; row < words.size(); row++) {
            for (int column = 0; column < words.get(row).length(); column++) {
                if (column >= words.size() || row >= words.get(column).length() || words.get(row).charAt(column) != words.get(column).charAt(row)) {
                    return false;
                }
            }
        }
        return true;
    }
}
