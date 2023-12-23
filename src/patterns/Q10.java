package patterns;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        //TODO: Basic Triangle Patterns
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int i = 1;
        while (i <= n) {    
            int j = 1;
            while (j <= i) {
                System.out.print(i + " ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
