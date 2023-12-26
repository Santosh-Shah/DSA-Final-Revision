package revision_once.patterns;

import java.util.Scanner;

public class Q21 {
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
            int value1 = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(value1 + " ");
                value1++;
            }

            // right column
            int value2 = i;
            for (int j = i; j > 0; j--) {
                System.out.print(value2 + " ");
                value2--;
            }
            System.out.println();
        }
    }
}
