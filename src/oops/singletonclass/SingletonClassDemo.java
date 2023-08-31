package oops.singletonclass;

public class SingletonClassDemo {
    private SingletonClassDemo() {

    }

    private static SingletonClassDemo instance;

    public static SingletonClassDemo getInstance() {
        if (instance == null) {
            instance = new SingletonClassDemo();
        }

        return instance;
    }
}
