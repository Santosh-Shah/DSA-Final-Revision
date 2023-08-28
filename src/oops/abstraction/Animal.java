package oops.abstraction;

abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }
    public abstract void animalSound();
    public String getName() {
        return name;
    }
}
