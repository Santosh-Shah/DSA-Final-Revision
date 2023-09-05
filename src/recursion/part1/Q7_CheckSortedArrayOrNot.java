package recursion.part1;

public class Q7_CheckSortedArrayOrNot {
    public static void main(String[] args) {
        int[] arr = {5, 7, 8, 2};
        System.out.println(isSorted(arr));
    }

    // check sorted array or not
    public static boolean isSorted(int[] arr) {
        // Base case
        if (arr.length == 0 || arr.length == 1) {
            return true;
        }

        if (arr[0] > arr[1]) {
            return false;
        }

        int[] temp = new int[arr.length - 1];
        for (int i = 1; i < arr.length; i++) {
            temp[i - 1] = arr[i];
        }
        return isSorted(temp);

    }
}
