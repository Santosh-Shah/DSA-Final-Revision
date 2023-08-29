package oops.polymorphism;

public class TestAB{
    public static void main(String[] args) {
        A obj = new B();
        System.out.println(obj.name);
        obj.display();
    }
}
