package array3;

import java.util.Scanner;

public class Basics {
    public static void main(String[] args) {
//        int[][] arr2D = new int[3][4];
//        System.out.println(arr2D);
//        arr2D[2][3] = 4;
//        System.out.println(arr2D[2][3]);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Rows: ");
        int rows = sc.nextInt();
        System.out.println("Enter the number of Columns: ");
        int colm = sc.nextInt();

        int[][] arr = new int[rows][colm];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < colm; j++) {
                System.out.println("Enter the element: " + i + "th row " + j + "th column");
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("---------------------------------------");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < colm; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
