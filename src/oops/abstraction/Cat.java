package oops.abstraction;

public class Cat extends Animal{

    public Cat(String name) {
        super(name);
    }
    public void animalSound() {
        System.out.println(getName() + ": mew mew---");
    }
}
