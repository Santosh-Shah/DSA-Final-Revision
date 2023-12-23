package patterns;

import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        //TODO: Basic Triangle Patterns
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int i = 1;
        while (i <= n) {    
            int j = 1;
            int p = i;
            while (j <= i) {
                System.out.print(p + " ");
                p--;
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
