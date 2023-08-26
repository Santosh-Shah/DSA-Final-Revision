package oops.inheritance.heirarchical;

public class Main {
    public static void main(String[] args) {
        BoxB boxB = new BoxB();
        boxB.printBoxA();
        boxB.printBoxB();
        System.out.println("-------------------------------");

        BoxC boxC = new BoxC();
        boxC.printBoxA();
        boxC.printBoxC();
        System.out.println("-------------------------------");

        BoxD boxD = new BoxD();
        boxD.printBoxA();
        boxD.printBoxD();

    }
}
