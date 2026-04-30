class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<Character> values = new HashSet<>();

        // Check rows/cols
        for (int i = 0; i < 9; i++){
            Set<Character> valuesRow = new HashSet<>();
            Set<Character> valuesCol = new HashSet<>();
            for (int j = 0; j < 9; j++){
                if (board[i][j] != '.' && !valuesRow.add(board[i][j])){
                    return false;
                }
                if (board[j][i] != '.' && !valuesCol.add(board[j][i])){
                    return false;
                }
            }
        }
        // Check 3x3s
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                Set<Character> values3x3 = new HashSet<>();
                for (int k = 0; k < 3; k++){
                    for (int r = 0; r < 3; r++){
                        if (board[3*i + k][3*j + r] != '.' && !values3x3.add(board[3*i + k][3*j + r])){
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }
}
