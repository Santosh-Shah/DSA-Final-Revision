package revision_once.arrays.easy;

public class Q11_CountTrippleSum {
    public static void main(String[] args) {
        // TODO: Find and return the total number of triples in the array/list which sum to target value.
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(tripleSum(arr, 12));
    }

    public static int tripleSum(int[] arr, int target) {
        int len = arr.length;
        int count = 0;
        for (int i = 0; i < len - 2; i++) {
            for (int j = i + 1; j < len - 1; j++) {
                for (int k = j + 1; k < len; k++) {
                    if (arr[i] + arr[j] + arr[k] == target) {
                        count = count + 1;
                        break;
                    }
                }
            }
        }
        return count;
    }
}
