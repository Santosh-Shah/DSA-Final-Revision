package patterns;

import java.util.Scanner;

public class Q22 {
    public static void main(String[] args) {
        //TODO: Basic Isosceles Triangle Patterns
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

            int num = 1;
            while (num <= i) {
                System.out.print("*" + " ");
                num++;
            }

            int dec = i - 1;
            while (dec >= 1) {
                System.out.print("*" + " ");
                dec--;
            }
            System.out.println();
            i++;
        }
    }
}
