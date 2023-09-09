package recursion.assignments;

public class Q1_GeometricSum {
    public static void main(String[] args) {
        System.out.println(geometricSum(4));
    }

    // Method to solve Geometric sum
    public static double geometricSum(int k) {
        // Base case
        if (k == 0) {
            return 1;
        }

        double ans = geometricSum(k - 1);
        return ans + 1 / (Math.pow(2, k));
    }
}
