package oops.abstraction_interface;

public interface Vehicle {

    int MAX_VALUE = 10000;
    void start();
    void stop();

    default void randomInterfaceValue() {
        System.out.println("This is from interface value");
    }
}
