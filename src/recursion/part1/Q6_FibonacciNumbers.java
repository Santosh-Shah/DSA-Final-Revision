package recursion.part1;

public class Q6_FibonacciNumbers {
    // Iterative way
    public static void fibonacciNumberIteratively(int num) {
        // Base case
        if (num <= 0 || num == 1) {
            return;
        }

        int first = 0;
        int second = 1;

        System.out.print("Fibonacci Series up to " + num + " numbers: ");

        for (int i = 0; i < num; i++) {
            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;
        }

    }

    // Recursive way
    public static void fibonacciNumberRecursively(int num) {
        for (int i = 0; i < num; i++) {
            System.out.print(helperFunction(i) + " ");
        }
    }
    private static int helperFunction(int num) {
        // Base case
        if (num <= 1) {
            return num;
        }

        return helperFunction(num - 1) + helperFunction(num - 2);
    }
    public static void main(String[] args) {
//        fibonacciNumberIteratively(5);
        fibonacciNumberRecursively(5);
    }
}
