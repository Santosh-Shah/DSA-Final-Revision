package oops.abstraction_interface;

public abstract class Shape {
    public abstract double area();

    double value;

    Shape() {
        System.out.println("Hello abstract");
    }
    static final int MAX_VALUE = 10;

    public void randomValue() {
        System.out.println("THis is random value");
    }

}
