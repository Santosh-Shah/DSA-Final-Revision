package patterns;

import java.util.Scanner;

public class Q30 {
    public static void main(String[] args) {
//        TODO: Zeros and Stars Pattern
//                *000*000*
//                0*00*00*0
//                00*0*0*00
//                000***000

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int start = 1;
        int end = 2 * n + 1;
        int mid = n + 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 2 * n + 1; j++) {
                if (j == start || j == end || j == mid) {
                    System.out.print("*");
                } else {
                    System.out.print("0");
                }
            }
            start++;
            end--;
            System.out.println();
        }
    }
}
