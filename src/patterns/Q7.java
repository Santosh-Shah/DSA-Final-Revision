package patterns;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        //TODO: Basic Triangle Patterns
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int i = 1;
        int p = 1;
        while (i <= n) {    
            int j = 1;
            while (j <= i) {
                System.out.print(p + " ");
                p++;
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
