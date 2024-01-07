package revision_once.arrays.hard;

public class BasicsOf2DArray {
    public static void main(String[] args) {

        int[][] arr = new int[4][5];

//        int[][] arr = {
//                {4, 3, 5, 6},
//                {44, 55, 66, 77},
//                {11, 22, 33}
//        };
        System.out.println(arr);
        System.out.println("length of array is: " + arr.length);

        // by using enhanced for loop
//        for (int[] row : arr) {
//            for (int elements : row) {
//                System.out.print(elements + " ");
//            }
//            System.out.println();
//        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
