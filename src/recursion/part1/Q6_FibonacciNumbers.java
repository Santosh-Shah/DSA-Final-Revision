package recursion.part1;

public class Q6_FibonacciNumbers {
    // Iterative way
    public static void fibonacciNumberIteratively(int num) {
        // Base case
        if (num <= 0 || num == 1) {
            return;
        }

        int a = 1;
        int b = 1;
        int ans = 0;
        System.out.println(a);
        System.out.println(b);
        int i = 3;
//        for (int i = 3; i <= num; i++) {
//            ans = a + b;
//            a = b;
//            b = ans;
//            System.out.println(b);
//        }
        while (i <= num) {
            ans = a + b;
            a = b;
            b = ans;
            System.out.println(b);
            i++;
        }

    }

    // Recursive way
    public static void fibonacciNumberRecursively(int num) {
        // Base case

    }
    public static void main(String[] args) {
        fibonacciNumberIteratively(5);

//        int[] arr = new int[5];
//        System.out.println(arr.length);
    }
}
