package revision_once.patterns;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        // TODO: Printing Basic Pattern
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No. :- ");
        int num = sc.nextInt();

        // Outer for loop for row
        for (int i = 0; i < num; i++) {
            // Inner for loop for column
            for (int j = 0; j < num; j++) {
                System.out.print("*");
            }
            // It will beak the line
            System.out.println();
        }

    }
}
