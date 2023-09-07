package recursion.part2;

public class Q6_BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        System.out.println(binarySearch(arr, 0, arr.length - 1, 3));
    }

    // Method to for Binary Search
    public static int binarySearch(int[] arr, int si, int ei, int x) {
        // Base case
        if (si > ei) {
            return -1;
        }

        int mi = (si + ei)/2;
        if (arr[mi] == x) {
            return mi;
        } else if (arr[mi] < x) {
            return binarySearch(arr, mi + 1, ei, x);
        } else {
            return binarySearch(arr, si, mi -1, x);
        }
    }
}
