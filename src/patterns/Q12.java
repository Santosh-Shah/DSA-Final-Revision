package patterns;

import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        //TODO: Basic Triangle Patterns
//        Enter the number: 5
//        A B C D E
//        A B C D E
//        A B C D E
//        A B C D E
//        A B C D E

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int i = 1;
        while (i <= n) {    
            int j = 1;
            while (j <= n) {
                char character = (char) ('A' + j - 1);
                System.out.print(character + " ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
