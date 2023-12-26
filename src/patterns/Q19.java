package patterns;

import java.util.Scanner;

public class Q19 {
    public static void main(String[] args) {
        //TODO: Basic Triangle Mirror Image Patterns
//        Enter the number: 4
//              1
//            1 2
//          1 2 3
//        1 2 3 4


        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int i = 1;
        while (i <= n) {    
            int spaces = 1;
            while (spaces <= n - i) {
                System.out.print(" " + " ");
                spaces++;
            }

            int num = 1;
            while (num <= i) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
            i++;
        }
    }
}
