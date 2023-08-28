package oops.abstraction;

public class Circle extends Shape{
    double radius;
    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return "Circle Color: " + super.getColor()
                + "\nArea of circle: " + area();
    }
}
