package backtracking;

public class PrintFirstPath {
    public static void main(String[] args) {
        int[][] maze = {
                {1, 1, 0},
                {1, 1, 0},
                {1, 1, 1}
        };

        System.out.println(printFirstPath(maze));
    }

    public static boolean printFirstPath(int[][] maze) {
        int n = maze.length;
        int[][] path = new int[n][n];
        return printFirstPath(maze, 0, 0, path);
    }

    private static boolean printFirstPath(int[][] maze, int i, int j, int[][] path) {
        // check if i and j is valid or not
        int n = maze.length;
        if (i < 0 || j < 0 || i >= n || j >= n) {
            return false;
        }

        // if cell is already part of the path
        if (path[i][j] == 1) {
            return false;
        }

        // if cell is blocked
        if (maze[i][j] == 0) {
            return false;
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
            return true;
        }

        // check top direction
        if (printFirstPath(maze, i - 1, j, path)) {
            return true;
        }

        // check right direction
        if (printFirstPath(maze, i, j + 1, path)) {
            return true;
        }

        // check button direction
        if (printFirstPath(maze, i + 1, j, path)) {
            return  true;
        }

        // check left direction
        if (printFirstPath(maze, i, j - 1, path)) {
            return true;
        }

        // none of the condition is satisfied then the path is not working out
        return false;

    }
}
