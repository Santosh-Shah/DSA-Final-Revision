package oops.polymorphism;

public class Main {
    public static void main(String[] args) {
//        HumanBeing student = new Student();
//        HumanBeing doctor = new Doctor();
//        HumanBeing sde = new SoftwareDeveloper();
//
//        student.whoIAm();
//        doctor.whoIAm();;
//        sde.whoIAm();

        Calculator calculator = new Calculator();
        System.out.println(calculator.manipulate(4, 5));
        System.out.println(calculator.manipulate("Calculator is my name"));
        System.out.println(calculator.manipulate(4, 5.0));
        System.out.println(calculator.manipulate(6.0, 8));
        System.out.println(calculator.manipulate(7.0, 10.1));



    }
}
