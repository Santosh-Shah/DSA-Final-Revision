package patterns;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        //TODO: Basic Patterns
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to print *: ");
        int n = sc.nextInt();
        int i = 1;
        while (i <= n) {
            int j = 1;
            while (j <= n) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
