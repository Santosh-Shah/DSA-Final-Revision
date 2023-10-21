package backtracking;

public class PlaceQueens {
    public static void main(String[] args) {
        placeNQueens(4);
    }

    public static void placeNQueens(int n) {
        int[][] board = new int[n][n];
        placeQueens(n, 0, board);
    }

    public static boolean isPossible(int[][] board, int n, int row, int col) {
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 1) {
                return false;
            }
        }
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }
        for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++) {
            if (board[i][j] == 1) {
                return false;
            }
        }
        return true;
    }

    public static void placeQueens(int n, int row, int board[][]) {
        if (row == n) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(board[i][j] + " ");
                }
            }
            System.out.println();
        } else {
            for (int j = 0; j < n; j++) {
                if (isPossible(board, n, row, j)) {
                    board[row][j] = 1;
                    placeQueens(n, row + 1, board);
                    board[row][j] = 0;
                }
            }
        }
    }
}

