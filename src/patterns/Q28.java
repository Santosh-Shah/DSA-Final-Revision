package patterns;

import java.util.Scanner;

public class Q28 {
    public static void main(String[] args) {
        //TODO: Odd Square
//                    1357
//                    3571
//                    5713
//                    7135

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        while (i <= n) {
            int valueToPrint = 2 * i - 1;
            int j = n;
            while (j > 0) {
                System.out.print(valueToPrint);
                valueToPrint += 2;

                int maxVal = (2 * n) - 1;
                if (valueToPrint > maxVal) {
                    valueToPrint = 1;
                }
                j--;
            }
            System.out.println();
            i++;
        }
    }
}
