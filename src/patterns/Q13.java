package patterns;

import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        //TODO: Basic Triangle Patterns
//        Enter the number: 4
//        A
//        B B
//        C C C
//        D D D D

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int i = 1;
        while (i <= n) {    
            int j = 1;
            while (j <= i) {
                char character = (char) ('A' + i - 1);
                System.out.print(character + " ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
