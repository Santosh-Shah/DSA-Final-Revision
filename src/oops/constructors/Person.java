package oops.constructors;

public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(Person obj) {
        System.out.println("This is copy constructor");
        this.name = obj.name;
        this.age = obj.age;
    }

    public static void main(String[] args) {
        Person person1 = new Person("Hariom Shah", 23);
        Person person2 = new Person(person1);
        person2.name = "Santosh Shah";

        System.out.println(person2.name);
        System.out.println(person2.age);
//        System.out.println(person1);

    }
}
