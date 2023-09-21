package recursion.assignments;

public class Q9_StairCase {
    // Method for staircase
    public static int stairCase(int n){
        if ( n == 0) {
            return 1;
        } else if (n < 0) {
            return 0;
        } else {
            return stairCase(n - 3) + stairCase(n - 2) + stairCase(n - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(stairCase(5));
    }
}
