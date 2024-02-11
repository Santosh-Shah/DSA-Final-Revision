package revision_once.strings;

public class Main {
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = "Python";
        String s3 = "Java";

        String str1 = new String("Java");
        String str2 = new String("Machine Learning");
        String str3 = new String("Python").intern();
    }
}
