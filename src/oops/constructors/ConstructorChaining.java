package oops.constructors;

public class ConstructorChaining extends Name{
    // it means call one constructor from other constructor

    {
        System.out.println("This constructor will be called first");
    }
    ConstructorChaining(int age) {
        this("Santosh Shah", "Vedas College");
        System.out.println("My age is " + age);

    }

    ConstructorChaining(String name, String collName) {
        this(name);
        System.out.println("My college name is " + collName);
    }

    ConstructorChaining(String name) {
        super(name);
        System.out.println("My name is " + name);
    }

    ConstructorChaining() {
        this(25);
    }

    {
        System.out.println("will be called second time");
    }

    public static void main(String[] args) {
        new ConstructorChaining();
    }
}
