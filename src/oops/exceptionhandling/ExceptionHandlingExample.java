package oops.exceptionhandling;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        try {
            // Code that may throw an exception
            int result = divide(10, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException ex) {
            // Handling a specific type of exception
            System.out.println("Error: " + ex.getMessage());
        } finally {
            // Cleanup code (optional)
            System.out.println("Finally block executed");
        }
    }


    public static int divide(int n1, int n2) {
        if (n2 == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return n1 / n2;
    }
}
