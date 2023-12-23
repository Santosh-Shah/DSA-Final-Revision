package patterns;

import java.util.Scanner;

public class Q29 {
    public static void main(String[] args) {
//        TODO: Number Star pattern
//                5432*
//                543*1
//                54*21
//                5*321
//                *4321

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= 1; j--) {
                if (i ==j) {
                    System.out.print("*");
                } else {
                    System.out.print(j);
                }
            }
            System.out.println();
        }
    }
}
