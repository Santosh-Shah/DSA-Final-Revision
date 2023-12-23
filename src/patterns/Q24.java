package patterns;

import java.util.Scanner;

public class Q24 {
    public static void main(String[] args) {
        //TODO: Basic Diamond of stars Patterns
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int firstHalf = (n + 1) / 2;
        int secHalf = firstHalf - 1;

        // first half
        int i = 1;
        while (i <= firstHalf) {
            int spaces = 1;
            while (spaces <= firstHalf - i) {
                System.out.print(" ");
                spaces++;
            }

            int stars = 1;
            while (stars <= 2 * i - 1) {
                System.out.print("*");
                stars++;
            }

            System.out.println();
            i++;
        }

        // second half
        int j = secHalf;
        while (j >= 1) {
            int spaces = 1;
            while (spaces <= secHalf - j + 1) {
                System.out.print(" ");
                spaces++;
            }

            int stars = 1;
            while (stars <= 2 * j - 1) {
                System.out.print("*");
                stars++;
            }

            System.out.println();
            j--;
        }
    }
}
