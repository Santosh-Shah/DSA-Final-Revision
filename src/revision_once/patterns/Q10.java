package revision_once.patterns;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No. :- ");
        int num = sc.nextInt();
        // outer loop represents row
        for (int i = 0; i < num; i++) {
            // inner loop represents column
            for (int j = 0; j <= i; j++) {
                System.out.print(i + 1 + " ");
            }
            System.out.println();
        }
    }
}
