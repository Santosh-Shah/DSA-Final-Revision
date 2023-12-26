package patterns;

import java.util.Scanner;

public class Q23 {
    public static void main(String[] args) {
        //TODO: Basic Isosceles Triangle Patterns
//        Enter the number: 4
//              1
//            2 3 2
//          3 4 5 4 3
//        4 5 6 7 6 5 4


        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int i = 1;
        while (i <= n) {
            int spaces = 1;
            while (spaces <= n - i) {
                System.out.print(" " + " ");
                spaces++;
            }

            int j = 1;
            int num = i;
            while (j <= i) {
                System.out.print(num + " ");
                num++;
                j++;
            }

            int dec = 2 * i - 2;
            j = 1;
            while (j <= i - 1) {
                System.out.print(dec + " ");
                j++;
                dec--;
            }
            System.out.println();
            i++;
        }
    }
}
