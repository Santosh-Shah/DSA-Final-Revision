package oops.object_singleton_wrapperclass;

public class ObjectClassExample {
    public static void main(String[] args) {
        Object obj1 = new Object();
        Object obj2 = new Object();
        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj1.equals(obj2));
        System.out.println(obj1.getClass());
        System.out.println(obj1.hashCode());
        System.out.println(obj1.toString());
    }
}
