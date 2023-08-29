package oops.inheritance.more;

public class Derived extends Base{
    private int y;

    public Derived() {
        System.out.println("Default constructor of Derived Class");
    }

    public Derived(int x, int y) {
        super(x);
        this.y = y;
        System.out.println("Parametrized constructor of Derived class");
    }

    public void display() {
        System.out.println("Value of x: " + x +"\nValue of y: " + y);
    }
}
