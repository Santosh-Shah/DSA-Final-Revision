package dynamicprogramming;

public class Q2_FibonacciNumberIteratively {
    public static void main(String[] args) {
        int n = 6;
//        int[] dp = new int[n + 1];
//        for (int i = 0; i < dp.length; i++) {
//            dp[i] = -1;
//        }

        System.out.println(fibonacci(n));
    }

    public static int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        }

        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];


    }
}
