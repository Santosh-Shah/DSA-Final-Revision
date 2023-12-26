package revision_once.patterns;

import java.util.Scanner;

public class Q22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No. :- ");
        int num = sc.nextInt();

        // outer loop represents row
        for (int i = 0; i < num; i++) {
            int spaces = num - i - 1;
            // inner loop prints spaces
            while (spaces != 0) {
                System.out.print("  ");
                spaces--;
            }

            // inner loop prints left column
            for (int j = 0; j <= i; j++) {
                System.out.print("*" + " ");
            }

            // right column
            for (int j = i; j > 0; j--) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
