package oops.constructors;

public class Box {
    double width, height, depth;

    Box(double w, double h, double d) {
        this.width = w;
        this.height = h;
        this.depth = d;
    }

    Box() {
        height = width = depth = 0;
    }

    Box(double len) {
        this();
        height = width = depth = len;
    }

    public double volume() {
        return width * depth * height;
    }

    public static void main(String[] args) {
        Box box1 = new Box(10, 5, 10);
//        System.out.println(box1.volume());

        Box box2 = new Box();
//        System.out.println(box2.volume());

        Box box3 = new Box(25);
//        System.out.println(box3.volume());

        double value;
        value = box1.volume();
        System.out.println(value);

        value = box2.volume();
        System.out.println(value);

        value = box3.volume();
        System.out.println(value);

    }
}
