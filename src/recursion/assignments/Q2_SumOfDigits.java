package recursion.assignments;

public class Q2_SumOfDigits {
    public static void main(String[] args) {
        System.out.println(sumOfDigit(1234));
    }

    // Method to solve sum of digits problem
    public static int sumOfDigit(int input) {
        // Base case
        if (input <= 1) {
            return input;
        }

        int smallOutput = sumOfDigit(input / 10);
        return smallOutput + input % 10;

    }
}
