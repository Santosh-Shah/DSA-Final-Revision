package recursion.part1;

public class Q10_CheckSortedArrayOrNot {
    public static void main(String[] args) {
        int[] arr = {5, 60, 7, 8};
        System.out.println(isSortedBetter(arr, 0));
    }

    // Better version to check sorted array or not
    public static boolean isSortedBetter(int[] arr, int startIndex) {
        if (startIndex == arr.length - 1) {
            return true;
        }

        if (arr[startIndex] > arr[startIndex + 1]) {
            return false;
        }

        return isSortedBetter(arr, startIndex + 1);
    }
}
