class Solution {
    public boolean isValidSudoku(char[][] board) {
        // Check Rows
        for (int row = 0; row < 9; row++) {
            HashSet<Character> hs = new HashSet<>();
            for (int column = 0; column < 9; column++) {
                if (board[row][column] != '.' && hs.contains(board[row][column])) {
                    return false;
                }
                hs.add(board[row][column]);
            }
        }

        // Check columns
        for (int column = 0; column < 9; column++) {
            HashSet<Character> hs = new HashSet<>();
            for (int row = 0; row < 9; row++) {
                if (board[row][column] != '.' && hs.contains(board[row][column])) {
                    return false;
                }
                hs.add(board[row][column]);
            }
        }

        // Check mini-matrices
        for (int row = 0; row < 9; row += 3) {
            for (int column = 0; column < 9; column += 3) {
                HashSet<Character> hs = new HashSet<>();
                for (int i = row; i < row + 3; i++) {
                    for (int j = column; j < column + 3; j++) {
                        if (board[i][j] != '.' && hs.contains(board[i][j])) {
                            return false;
                        }
                        hs.add(board[i][j]);
                    }
                }
            }
        }

        return true;
    }
}
