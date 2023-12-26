package revision_once.patterns;

import java.util.Scanner;

public class Q17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No. :- ");
        int num = sc.nextInt();
        char temp = (char) ('A' + num - 1);
        // outer loop represents row
        for (int i = 0; i < num; i++) {
            char value = temp;
            // inner loop represents column
            for (int j = 0; j <= i; j++) {
                System.out.print(value + " ");
                value++;
            }
            temp--;
            System.out.println();
        }
    }
}
