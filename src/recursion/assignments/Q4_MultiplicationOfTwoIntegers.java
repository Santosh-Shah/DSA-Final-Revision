package recursion.assignments;

public class Q4_MultiplicationOfTwoIntegers {
    public static void main(String[] args) {
        System.out.println(multiplicationOfIntegers(5, 3));
    }

    // Multiply two integer using addition and substraction
    public static int multiplicationOfIntegers(int m, int n) {
        if (m == 0 || n == 0) {
            return 0;
        }

        return m + multiplicationOfIntegers(m,n -1);
    }
}
