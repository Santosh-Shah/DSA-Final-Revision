package oops.lec1;

import com.sun.security.jgss.GSSUtil;

public class Dog {
    String name;
    String breed;
    int age;
    String color;

    // Constructors declaration of class
    public Dog(String name, String breed, int age, String color) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.color = color;
    }

    // method to get name of the dog
    public String getName() {
        return name;
    }

    // method to get breed of the dog
    public String getBreed() {
        return breed;
    }

    // method to get age of the dog
    public int getAge() {
        return age;
    }

    // method to get color of the dog
    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return ("Dog name: " + getName()
        + "\nBreed is: " + getBreed()
        + "\nAge is: " + getAge()
        + "\nColor is: " + getColor());
    }

    public static void main(String[] args) {
        Dog dog1 = new Dog("Maneesh Shah", "Teraiwasi", 19, "Brown");
        Dog dog2 = new Dog("Krishna Shah", "Teraiwasi", 23, "Black");

        System.out.println(dog1.toString());
        System.out.println("................--------------------..................___________________");

        System.out.println(dog2.toString());
    }
}
