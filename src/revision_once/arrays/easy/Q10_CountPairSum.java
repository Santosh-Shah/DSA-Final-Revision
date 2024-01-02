package revision_once.arrays.easy;

public class Q10_CountPairSum {
    public static void main(String[] args) {
        // TODO: Find and return the total number of pairs in the array/list which sum to target value.
//        int[] arr = {2, 3, 4, 5, 1};
        int[] arr = {2, 4, 3, 1, 6, 7};
        System.out.println(pairSum(arr, 5));
    }

    public static int pairSum(int[] arr, int target) {
        int len = arr.length;
        int pairCount = 0;
        for (int i = 0; i < len - 1; i++) {
            for (int j = i + 1; j < len; j++) {
                if (arr[i] + arr[j] == target) {
                    pairCount = pairCount + 1;
                    break;
                }
            }
        }
        return pairCount;
    }
}
