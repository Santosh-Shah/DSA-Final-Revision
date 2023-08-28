package oops.keywords;

public class Test2 {
    int a;
    int b;

    Test2() {
        this.a = 5;
        this.b = 9;
    }

    Test2 get() {
        return this;
    }

    public void display() {
        System.out.println("a and b: " + a + " and "+ b);
    }
}
