package oops.inheritance.multiple;

public class BoxD implements BoxC{

    @Override
    public void printBoxA() {
        System.out.println("Print Box A Interface");
    }

    @Override
    public void printBoxB() {
        System.out.println("Print Box B Interface");
    }

    @Override
    public void printBoxC() {
        System.out.println("Print Box C Interface");
    }

    public void printBoxD() {
        System.out.println("Print Box D Interface");
    }
}
