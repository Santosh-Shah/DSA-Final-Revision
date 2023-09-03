package oops.keywords.staticdemo;

public class StaticBlock {
    static int a = 5;
    static int b;

    static {
        System.out.println("I will just at once");
        b = a * 4;
    }

    public static void main(String[] args) {
        StaticBlock staticBlock = new StaticBlock();
        System.out.println(staticBlock.a + "\n" + staticBlock.b);

        staticBlock.b += 3;
        System.out.println(staticBlock.a + "\n" + staticBlock.b);
    }
}
