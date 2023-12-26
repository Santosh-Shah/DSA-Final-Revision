package revision_once.patterns;

import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No. :- ");
        int num = sc.nextInt();
        // outer loop represents row
        for (int i = 0; i < num; i++) {
            char value = 'A';
            // inner loop represents column
            for (int j = 0; j < num; j++) {
                System.out.print(value + " ");
                value++;
            }
            System.out.println();
        }
    }
}
