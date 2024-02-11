package oops.abstraction_interface;

public class Main {
    public static void main(String[] args) {
//        Circle circle = new Circle(45);
//        circle.randomValue();
//        Rectangle rect = new Rectangle(10, 25);
//        rect.randomValue();
//        System.out.println(rect.value);
//
//        System.out.println(circle.area());
//        System.out.println(rect.area());


        Bike bike = new Bike();
        bike.start();
        bike.stop();

        System.out.println("-----------------------");

        Car car = new Car();
        car.start();
        car.stop();
        System.out.println(car.MAX_VALUE);

        bike.randomInterfaceValue();
    }
}
