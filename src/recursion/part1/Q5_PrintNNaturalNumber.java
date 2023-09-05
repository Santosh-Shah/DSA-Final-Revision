package recursion.part1;

public class Q5_PrintNNaturalNumber {
    // Recursive way
    public static void printNaturalNumber(int num) {
        // Base case
        if (num <= 0) {
            return;
        }

        printNaturalNumber(num - 1);
        System.out.println(num);

    }
    public static void main(String[] args) {
        printNaturalNumber(5);
    }
}
