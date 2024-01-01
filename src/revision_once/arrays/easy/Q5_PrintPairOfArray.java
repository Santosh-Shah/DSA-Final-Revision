package revision_once.arrays.easy;

public class Q5_PrintPairOfArray {
    public static void main(String[] args) {
        int[] arr = {5, 6, 4, 7, 8, 9};
        printPair(arr);
    }

    public static void printPair(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                System.out.println("(" + arr[i] + "," + arr[j] + ")");
            }
//            System.out.println();
        }
    }
}
