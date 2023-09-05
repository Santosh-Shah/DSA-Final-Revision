package recursion.part1;

public class Q12_FindLastIndex {
    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 9, 10};
        System.out.println(findLastIndex(arr, 10));
    }

    // find last index of the array
    public static int findLastIndex(int[] arr, int target) {
        return findLastIndex(arr, target, 0);
    }

    public static int findLastIndex(int[] arr, int target, int si) {
        // Base case
        if (si == arr.length) {
            return -1;
        }

        int ans = findLastIndex(arr, target, si + 1);
        if (ans != -1) {
            return ans;
        }

        if (arr[si] == target) {
            return si;
        } else {
            return -1;
        }
    }

}
