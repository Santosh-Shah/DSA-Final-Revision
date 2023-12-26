package patterns;

import java.util.Scanner;

public class Q17 {
    public static void main(String[] args) {
        //TODO: Basic Triangle Patterns
//        Enter the number: 5
//        E
//        D E
//        C D E
//        B C D E
//        A B C D E

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int i = 1;
        while (i <= n) {    
            int j = 1;
            char character = (char) ('A' + n - i);
            while (j <= i) {
                System.out.print(character + " ");
                character++;
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
