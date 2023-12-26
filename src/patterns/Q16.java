package patterns;

import java.util.Scanner;

public class Q16 {
    public static void main(String[] args) {
        //TODO: Basic Triangle Patterns
//        Enter the number: 5
//        A
//        B C
//        C D E
//        D E F G
//        E F G H I

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int i = 1;
        while (i <= n) {    
            int j = 1;
            char character = (char) ('A' + i - 1);
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
