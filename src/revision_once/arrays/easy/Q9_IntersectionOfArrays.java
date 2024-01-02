package revision_once.arrays.easy;

public class Q9_IntersectionOfArrays {
    public static void main(String[] args) {
        // TODO: print the intersection of arrays II
        int[] arr1 = {5, 7, 8, 4, 3, 9};
        int[] arr2 = {7, 5, 0, 10, 3};
        printIntersection(arr1, arr2);
    }


    public static void printIntersection(int[] arr1, int[] arr2) {
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    System.out.print(arr2[j] + " ");
                    arr2[j] = Integer.MIN_VALUE;
                    break;
                }
            }
        }
    }
}
