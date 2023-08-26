package oops.lec1;

public class Student {

    // attributes of student
    String name;
    int age;
    String phoneNo;

    // Default constructor
    Student() {
        System.out.println("Default Constructor is called!...");
    }



    // constructor to print student details
    Student(String name, int age, String phoneNo) {
        System.out.println("My name is: " + name + "\n" + "age: " + age + "\n" + "Phone Number: " + phoneNo);
    }



    // Copy Constructor
    Student(Student std) {
        this.name = std.name;
        this.age = std.age;
        this.phoneNo = std.phoneNo;
    }

    // main methods
    public static void main(String[] args) {
        Student std1 = new Student("Hariom Shah", 20, "9811243552");
        System.out.println("---------------------------------");

        Student std2 = new Student("Santosh Shah", 23, "9849697391");
        System.out.println("---------------------------------");

        Student std3 = new Student("Maneesh Shah", 24, "9825263516");

        new Student();

        Student std4 = new Student(std2);
        System.out.println(std4.name + std4.age + std4.phoneNo);
    }
}
