package oops.encapsulation;

public class Main {
    public static void main(String[] args) {
//        Student std1 = new Student();
//        std1.setName("Hariom Shah");
//        std1.setCollegeName("National Infotech pvt. ltd");
//        std1.setEmail("hariom@gmail.com");
//        std1.setRollNo(13);
//
//        System.out.println(std1.getName());
//        System.out.println(std1.getCollegeName());
//        System.out.println(std1.getEmail());
//        System.out.println(std1.getRollNo());
//        System.out.println("==========================-----------------==============================");
//
//        Student std2 = new Student();
//        std2.setName("RadheShyam Shah");
//        std2.setCollegeName("Taxes College pvt. ltd");
//        std2.setEmail("radheshyam@gmail.com");
//        std2.setRollNo(10);
//
//        System.out.println(std2.getName());
//        System.out.println(std2.getCollegeName());
//        System.out.println(std2.getEmail());
//        System.out.println(std2.getRollNo());
//        System.out.println("==========================-----------------==============================");



        Car car1 = new Car("carName1", "carModel1", 2020);
        car1.setModel("ModelCar1");

        Car car2 = new Car("carName2", "carModel2", 2021);
        Car car3 = new Car("carName3", "carModel3", 2022);

        System.out.println("Car1 Name:" + car1.getName() + "\nCar1 Model: " + car1.getModel() + "\nCar1 made year: " + car1.getYear());
        System.out.println("--------------");
        System.out.println("Car2 Name:" + car2.getName() + "\nCar2 Model: " + car2.getModel() + "\nCar2 made year: " + car2.getYear());
        System.out.println("---------------");
        System.out.println("Car3 Name:" + car3.getName() + "\nCar3 Model: " + car3.getModel() + "\nCar3 made year: " + car3.getYear());

    }
}
