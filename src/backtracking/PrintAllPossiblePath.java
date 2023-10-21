package backtracking;

public class PrintAllPossiblePath {
    public static void main(String[] args) {
        int[][] maze = {
                {1, 1, 0},
                {1, 1, 0},
                {1, 1, 1}
        };

        printAllPossiblePath(maze);
    }

    public static void printAllPossiblePath(int[][] maze) {
        int n = maze.length;
        int[][] path = new int[n][n];
        printAllPossiblePath(maze, 0, 0, path);
    }

    private static void printAllPossiblePath(int[][] maze, int i, int j, int[][] path) {
        // check if i and j is valid or not
        int n = maze.length;
        if (i < 0 || j < 0 || i >= n || j >= n || maze[i][j] == 0 || path[i][j] == 1) {
            return;
        }

        // all previous condition is false then make current position is possible that 1;
        path[i][j] = 1;

        // if i and j reached to the destination
        if (i == n - 1 && j == n - 1) {
            for (int r = 0; r < n; r++) {
                for (int c = 0; c < n; c++) {
                    System.out.print(path[r][c] + " ");
                }
                System.out.println();
            }

            System.out.println();
            path[i][j] = 0;
            return;
        }

        // check top direction
        printAllPossiblePath(maze, i - 1, j, path);

        // check right direction
        printAllPossiblePath(maze, i, j + 1, path);

        // check button direction
        printAllPossiblePath(maze, i + 1, j, path);

        // check left direction
        printAllPossiblePath(maze, i, j - 1, path);

        path[i][j] = 0;
        // none of the condition is satisfied then the path is not working out
//        return false;

    }
}
