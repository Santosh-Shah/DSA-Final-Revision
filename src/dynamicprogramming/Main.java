package dynamicprogramming;

public class Main {
    public static void main(String[] args) {
        int n = 5;
//        fibonacciSeries(n);
        for (int i = 0; i < n; i++) {
            System.out.println(fibonacciSeries(i));
        }
    }

    public static int fibonacciSeries(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacciSeries(n - 1) + fibonacciSeries(n - 2);
    }
}
