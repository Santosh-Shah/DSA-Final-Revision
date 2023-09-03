package recursion;

public class Q1_Factorial {
    // Iterative way to find factorial of n number
    public static int iterativeWay(int num) {
        // base case
        if (num <= 0) {
            return -1;
        }

        int ans = 1;
        for (int i = 1; i <= num; i++) {
            ans = ans * i;
        }
        return ans;
    }

    // Recursive way to find factorial of n number
    public static int recursiveWay(int num) {
        // Base case
        if (num == 0) {
            return 1;
        }

        int smallOutput = recursiveWay(num - 1);
        return smallOutput * num;

    }

    public static void main(String[] args) {
//        System.out.println(iterativeWay(4));
        System.out.println(recursiveWay(5));
    }
}
