package oops.interfaces;

public class Main {
    public static void main(String[] args) {
        BabyBoyImpl babyBoy = new BabyBoyImpl();
//        babyBoy.getBabyBoyName();
//        System.out.println("He is just: " + babyBoy.age);

        BabyBoy.display();
        babyBoy.display();



    }
}
