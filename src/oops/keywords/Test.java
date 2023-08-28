package oops.keywords;

public class Test {
    int a;
    int b;

    Test() {
        // this(10, 20)- will call parametrized constructor
        this(10, 20);
        System.out.println("This is default Constructor from Test Class");
    }

    Test(int a, int b) {
        this.a = a;
        this.b = b;
        System.out.println("This is parametrized constructor from Test Class");
    }
}
