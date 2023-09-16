package randomproblems.day1;

import java.util.Scanner;

public class Q1_FindCharacterCase {
    public static void main(String[] args) {
//        int A = 'A';
//        int Z = 'Z';
//        int a = 'a';
//        int z = 'z';
//        System.out.println(A);
//        System.out.println(Z);
//        System.out.println(a);
//        System.out.println(z);

//        char b = 65;
//        for (int i = 65; i <= 90; i++) {
//            System.out.println(b);
//            b++;
//        }

        // TODO: if the character is between
        //  A - Z print 1
        //  a - z then print 0
        //  else print -1

        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        int value = input.charAt(0);
        if (value >= 65 && value <= 90) {
            System.out.println(1);
        } else if (value >= 97 && value <= 122) {
            System.out.println(0);
        } else {
            System.out.println(-1);
        }

    }
}
