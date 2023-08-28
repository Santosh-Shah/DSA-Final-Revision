package oops.abstraction;

import java.security.PublicKey;

public class Dog extends Animal{

    public Dog(String name) {
        super(name);
    }
    @Override
    public void animalSound() {
        System.out.println(getName() + ": Bark Bark----");
    }
}
