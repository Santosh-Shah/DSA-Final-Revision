package dynamicprogramming;

public class Q3_StairCase {
    public static void main(String[] args) {
        System.out.println(staircase(5));
    }

    public static long staircase(int n) {
        //Your code goes here

        int[] ways = new int[n + 1];
        if (n == 0) {
            return 1;
        }

        if (n == 1 || n == 2) {
            return n;
        }

        // int[] ways = new int[n + 1];
        ways[0] = 1;
        ways[1] = 1;
        ways[2] = 2;

        for (int i = 3; i <= n; i++) {
            ways[i] = ways[i - 1] + ways[i - 2] + ways[i - 3];
        }

        return ways[n];
    }
}
