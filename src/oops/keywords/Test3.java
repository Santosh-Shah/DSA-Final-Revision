package oops.keywords;

public class Test3 {
    int a;
    int b;

    Test3() {
        this.a = 50;
        this.b = 90;
    }

    void get() {
        display();
        display(this);
    }

    public void display(Test3 obj) {
        System.out.println("a and b: " + obj.a + " and "+ obj.b);
    }

    public void display() {
        System.out.println("nothing printed");
    }
}
