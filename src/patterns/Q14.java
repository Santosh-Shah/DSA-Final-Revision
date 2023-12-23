package patterns;

import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        //TODO: Basic Triangle Patterns
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int i = 1;
        while (i <= n) {    
            int j = 1;
            char character = (char) ('A' + i - 1);
            while (j <= n) {
                System.out.print(character + " ");
                character++;
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
