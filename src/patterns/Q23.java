package patterns;

import java.util.Scanner;

public class Q23 {
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
