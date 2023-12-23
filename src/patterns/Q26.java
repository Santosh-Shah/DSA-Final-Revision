package patterns;

import java.util.Scanner;

public class Q26 {
    public static void main(String[] args) {
        //TODO: Parallelogram Patterns
//                *****
//                 *****
//                  *****
//                   *****
//                    *****

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int i = 1;
        while (i <= n) {
            int spaces = 1;
            while (spaces <= i - 1) {
                System.out.print(" ");
                spaces++;
            }

            int stars = 1;
            while (stars <= n) {
                System.out.print("*");
                stars++;
            }

            System.out.println();
            i++;
        }
    }
}
