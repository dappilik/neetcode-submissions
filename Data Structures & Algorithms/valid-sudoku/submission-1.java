class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int row = 0; row < 9; row++) {
            boolean[] seen = new boolean[9];
            for (int col = 0; col < 9; col++) {
                char c = board[row][col];
                if (c != '.') {
                    int index = c - '1';
                    if (seen[index]) {
                        return false;
                    } else {
                        seen[index] = true;
                    }
                }
            }
        }

        for (int col = 0; col < 9; col++) {
            boolean[] seen = new boolean[9];
            for (int row = 0; row < 9; row++) {
                char c = board[row][col];
                if (c != '.') {
                    int index = c - '1';
                    if (seen[index]) {
                        return false;
                    } else {
                        seen[index] = true;
                    }
                }
            }
        }

        for (int row = 0; row < 9; row = row + 3) {
            for (int col = 0; col < 9; col = col + 3) {
                boolean[] seen = new boolean[9];
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        char c = board[row + i][col + j];
                        if (c != '.') {
                            int index = c - '1';
                            if (seen[index]) {
                                return false;
                            } else {
                                seen[index] = true;
                            }
                        }
                    }
                }
            }
        }

        return true;
    }
}
