package recursion;

public class Q9_CheckNum {
    public static void main(String[] args) {
        int[] arr = {5, 6, 2, 70};
        System.out.println(checkNum(arr, 70));
    }

    // check number in array
    public static boolean checkNum(int[] arr, int target) {
        return checkNum(arr, target, 0);
    }

    public static boolean checkNum(int[] arr, int target, int startIndex) {
        // Base case
        if (arr.length == startIndex) {
            return false;
        }

        if (arr[startIndex] == target) {
            return true;
        }

        return checkNum(arr, target, startIndex + 1);
    }
}
