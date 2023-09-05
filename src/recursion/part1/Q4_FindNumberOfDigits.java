package recursion.part1;

public class Q4_FindNumberOfDigits {
    // Recursive way
    public static int countRecursively(int num) {
        // Base case
        if (num / 10 == 0) {
            return 1;
        }

        int smallOutput = countRecursively(num / 10);
        return smallOutput + 1;
    }
    public static void main(String[] args) {
        System.out.println(countRecursively(123));
    }
}
