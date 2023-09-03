package oops.keywords.staticdemo;

//class Test {
//    static String name;
//    Test(String name) {
//        this.name = name;
//    }
//}

public class InnerClass {
    // we cannot create super class as static
    // we can only create sub-class as static
    class Test {
        static String name;
        Test(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        InnerClass innerClass = new InnerClass();
        InnerClass.Test test = innerClass.new Test("Santosh");
        InnerClass.Test test1 = innerClass.new Test("Rohit");

//        Test test1 = new Test("Hariom");
//        Test test2 = new Test("Maneesh");
        System.out.println(test.name);
        System.out.println(test1.name);
    }
}
