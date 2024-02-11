package oops.object_singleton_wrapperclass;

public class WrapperClassDemo {
    public static void main(String[] args) {
        Integer integerValue = Integer.valueOf(10);
        Double doubleValue = Double.valueOf(10.22);
        Character characterValue = Character.valueOf('S');

        // Using methods of wrapper classes
        System.out.println("Integer value: " + integerValue.intValue());
        System.out.println("Double value: " + doubleValue.doubleValue());
        System.out.println("Character value: " + characterValue.charValue());

    }
}
