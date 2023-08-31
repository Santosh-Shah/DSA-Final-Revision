package oops.singletonclass;

public class Main {
    public static void main(String[] args) {
        SingletonClassDemo obj = SingletonClassDemo.getInstance();
        System.out.println(obj);

        SingletonClassDemo obj1 = SingletonClassDemo.getInstance();
        System.out.println(obj1);

        SingletonClassDemo obj2 = SingletonClassDemo.getInstance();
        System.out.println(obj2);

    }
}
