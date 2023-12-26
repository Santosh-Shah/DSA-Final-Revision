package patterns;

import java.util.Scanner;

public class Q20 {
    public static void main(String[] args) {
        //TODO: Basic Inverted Triangle Patterns
//        Enter the number: 5
//                * * * * *
//                * * * *
//                * * *
//                * *
//                *


        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int i = 1;
        while (i <= n) {
            int j = 1;
            while (j <= n - i + 1) {
                System.out.print("*" + " ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
