package recursion;

public class Q2_SumOfNNaturalNumber {
    // Iterative way
    public static int iterativeWay(int num) {
        // Base case
        if (num <= 0) {
            return 0;
        }

        int ans = 0;
        for (int i = 1; i <= num; i++) {
            ans += i;
        }

        return ans;
    }

    // Recursive way
    public static int recursiveWay(int num) {
        // Base case
        if (num <= 0) {
            return 0;
        }

        int smallOutput = recursiveWay(num -1);
        return smallOutput + num;
    }
    public static void main(String[] args) {
//        System.out.println(iterativeWay(10));
        System.out.println(recursiveWay(5));
    }
}
