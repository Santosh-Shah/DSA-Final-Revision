package recursion.assignments;

public class Q5_CountZeros {
    public static void main(String[] args) {
        System.out.println(countZeros(10203));
    }

    // Method to count zeros
    public static int countZeros(int input) {
        if (input < 10) {
            if (input == 0) {
                return 1;
            } else {
                return 0;
            }
        }

        if (input % 10 == 0) {
            return countZeros(input/10) + 1;
        } else {
            return countZeros(input/10);
        }
    }
}
