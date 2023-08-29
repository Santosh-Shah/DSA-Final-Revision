package oops.inheritance.more;

public class Base {
    int x;
    public Base() {
        System.out.println("Default constructor of Base Class");
    }

    public Base(int x) {
        this.x = x;
        System.out.println("Parametrized Constructor of Base Class");
    }
}
