package revision_once.patterns;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No. :- ");
        int num = sc.nextInt();

        // outer loop represents row
        for (int i = 1; i <= num; i++) {
            // inner loop represents column
            for (int j = 0; j < 5; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
