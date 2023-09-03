package oops.keywords.staticdemo;

public class Human {
    String name;
    int age;
    static int population;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
        Human.population++;
    }

    static void meeting() {
        // inside static method you cannot use non-static stuffs
//        System.out.println(this.age);
    }


    // this is not depending on object
    static void greeding() {
        System.out.println("This is greeding");
        greeding1();

        // this will not work
        // because fun() need object of call itself
        // greeding() do not need objects to call itself
//        fun();
    }

    static void greeding1() {
        System.out.println("this is greeding1");
    }

    // this is dependent on objects
    void fun() {
        System.out.println("Having fun");
        greeding();
    }

    void fun1() {
        System.out.println("Having fun1");
        fun();
    }
}
