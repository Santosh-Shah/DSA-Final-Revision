package recursion;

public class Q3_PowerOfNNumber {
    // Iterative way
    public static int iterativeWay(int x, int n) {
        // Base case
        if (n == 0) {
            return 1;
        }

        int ans = 1;
        for (int i = 1; i <= n; i++) {
            ans = ans * x;
        }
        return ans;
    }


    // Recursive way
    public static int recursiveWay(int x, int n) {
        // Base case
        if (n == 0) {
            return 1;
        }

        int smallOutput = recursiveWay(x, n - 1);
        return smallOutput * x;
    }
    public static void main(String[] args) {
//        System.out.println(iterativeWay(2, 5));
        System.out.println(recursiveWay(2, 5));
    }
}
