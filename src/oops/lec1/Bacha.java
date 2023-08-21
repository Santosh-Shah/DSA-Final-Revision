package oops.lec1;

class Bacha {

    // default access modifier
    // it can be accessible only withing the same package only

    // private access modifier
    // it can be accessible only within class in which it declared
    private void padhai() {
        System.out.println("Bacha is studying!");
    }

    static class AnotherBacha extends Bacha {
        void higherPadhai() {
            System.out.println("Bacha is studying higher study!");
        }
    }

    public static void main(String[] args) {
        Bacha study = new Bacha();
        study.padhai();

        AnotherBacha higherStudy = new AnotherBacha();
        higherStudy.higherPadhai();
//        higherStudy.padhai();
    }
}
