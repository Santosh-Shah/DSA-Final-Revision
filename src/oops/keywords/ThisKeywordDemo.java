package oops.keywords;

public class ThisKeywordDemo extends Another{
    int num = 15;

    public ThisKeywordDemo() {
        System.out.println("This is Default Constructor from ThisKeywordDemo Class");
    }
    public ThisKeywordDemo(int num) {
        // this()- will invoke the default constructor
//        this();
        this.num = num;
        System.out.println("This is parametrized Constructor");
    }

    public void displayName() {
        name();
    }

    private void name() {
        System.out.println("This is ThisKeywordDemo Class");
    }
}
