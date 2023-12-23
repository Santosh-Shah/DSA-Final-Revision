package patterns;

import java.util.Scanner;

public class Q18 {
    public static void main(String[] args) {
        //TODO: Basic Triangle Mirror Image Patterns
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

            int stars = 1;
            while (stars <= i) {
                System.out.print("*" + " ");
                stars++;
            }
            System.out.println();
            i++;
        }
    }
}
