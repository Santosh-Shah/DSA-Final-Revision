package recursion;

public class Q11_FindIndexOfNumber {
    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 9, 10};
        System.out.println(findIndex(arr, 9));
    }

    // find index of present number
    public static int findIndex(int[] arr, int target) {
        return findIndex(arr, target, 0);
    }

    public static int findIndex(int[] arr, int target, int si) {
        // Base case
        if (arr.length == 0) {
            return -1;
        }

        if (si == arr.length) {
            return -1;
        }

        if (arr[si] == target) {
            return si;
        }

        return findIndex(arr, target, si + 1);
    }
}
