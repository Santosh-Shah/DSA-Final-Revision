package string;

import com.sun.security.jgss.GSSUtil;

public class StringBasics {
    public static void main(String[] args) {

        // String => Strings are the type of objects that can store the character of values.
        // A string acts the same as an array of characters in Java.

        // ways to create string
        // 1) String literal
//        String str = "Vedas College";


        // 2) using new keyword
//        String str = new String("Vedas College");
//        System.out.println(str);
//        System.out.println(str.charAt(5));

        //TODO: note: constant pool=> the constant pool is where string literals are stored.
        // When you define a string literal in your Java code, such as "Hello, World!",
        // it's stored in the constant pool. If multiple parts of your code use the same string literal,
        // they will reference the same memory location in the constant pool
        // rather than creating multiple copies of the same string in memory.


        String str = "College";
        System.out.println(str.length());
        System.out.println(str.substring(1));

    }
}
