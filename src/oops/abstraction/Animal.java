package oops.abstraction;

abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }
    public abstract void animalSound();
    public void display() {
        System.out.println("abstract animal class");
    }
    public String getName() {
        return name;
    }
}
