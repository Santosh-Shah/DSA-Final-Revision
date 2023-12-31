package oops.abstraction;

public class Rectangle extends Shape{
    double length;
    double width;

    public Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    double area() {
        return length * width;
    }

    @Override
    public String toString() {
        return "Color of Rectangle: " + super.getColor()
                + "\nArea of Rectangle: " + area();
    }
}
