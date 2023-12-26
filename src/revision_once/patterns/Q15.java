package revision_once.patterns;

import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No. :- ");
        int num = sc.nextInt();
        char value = 'A';
        // outer loop represents row
        for (int i = 0; i < num; i++) {
            char temp = value;
            // inner loop represents column
            for (int j = 0; j <= i; j++) {
                System.out.print(temp + " ");
                temp++;
            }
            value++;
            System.out.println();
        }
    }
}
