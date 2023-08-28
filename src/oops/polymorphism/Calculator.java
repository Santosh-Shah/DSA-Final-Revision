package oops.polymorphism;

public class Calculator {
    // this is called method overloading
    public int manipulate(int n1, int n2) {
        return n1 + n2;
    }

    public double manipulate(double n1, double n2) {
        return n1 * n2;
    }

    public String manipulate(String name) {
        return name;
    }

    public double manipulate(int n1, double n2) {
        return n1 * n2;
    }

    public double manipulate(double n1, int n2) {
        return n1 * n2;
    }
}
