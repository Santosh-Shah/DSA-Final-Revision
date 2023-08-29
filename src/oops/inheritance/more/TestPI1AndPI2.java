package oops.inheritance.more;

public class TestPI1AndPI2 implements PI2, PI1 {
    public static void main(String[] args) {
        TestPI1AndPI2 test = new TestPI1AndPI2();
//        test.show();
        test.display();
    }

    @Override
    public void display() {
        PI2.super.display();
        PI1.super.display();
    }
}
