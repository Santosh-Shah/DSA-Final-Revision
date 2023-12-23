package patterns;

import java.util.Scanner;

public class Q25 {
    public static void main(String[] args) {
        //TODO: Half Diamond Patterns
//                *
//                *1*
//                *121*
//                *12321*
//                *121*
//                *1*
//                *

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // first half
        System.out.println("*");
        int i = 1;
        while (i <= n) {
            System.out.print("*");

            int j = 1;
            while (j <= i) {
                System.out.print(j);
                j++;
            }

            j = j - 2;
            while (j >= 1) {
                System.out.print(j);
                j--;
            }

            System.out.println("*");
            i++;
        }

        // second half
        i = 1;
        while (i <= n - 1) {
            System.out.print("*");

            int j = 1;
            while (j <= n - i) {
                System.out.print(j);
                j++;
            }

            j = j - 2;
            while (j >= 1) {
                System.out.print(j);
                j--;
            }
            System.out.println("*");
            i++;
        }
        System.out.print("*");
    }
}
