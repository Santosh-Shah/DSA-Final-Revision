package patterns;

import java.util.Scanner;

public class Q27 {
    public static void main(String[] args) {
        //TODO: Sum Patterns
//                1=1
//                1+2=3
//                1+2+3=6

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;

        int i = 1;
        while (i <= n) {
            int j = 1;
            sum += i;
            while (j <= i) {
                System.out.print(j);
                if (i == j) {
                    System.out.print("=");
                } else {
                    System.out.print("+");
                }
                j++;
            }
            System.out.println(sum);
            i++;
        }
    }
}
