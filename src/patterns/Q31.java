package patterns;

import java.util.Scanner;

public class Q31 {
    public static void main(String[] args) {
//        TODO: Check Armstrong
//        Write a Program to determine if the given number is Armstrong number or not.
//        Print true if number is armstrong, otherwise print false.


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int digits = 0;
        int num = n;
        while (num > 0) {
            digits++;
            num /= 10;
        }

        int newNum = 0;
        num = n;
        while (num > 0) {
            int last = num % 10;
            newNum += Math.pow(last, digits);
            num /= 10;
        }

        if (newNum == n) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
