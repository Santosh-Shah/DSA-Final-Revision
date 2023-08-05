package array2;

public class Q6 {
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 7, 9, 11, 12, 45};
        int[] arr2 = {2, 4, 6, 10, 13, 50};
        int[] ansArray = mergeTwoSortedArray(arr1, arr2);
        printArray(ansArray);
    }

    public static int[] mergeTwoSortedArray(int[] arr1, int[] arr2) {
        int len1 = arr1.length;
        int len2 = arr2.length;
        int i = 0;
        int j = 0;
        int k = 0;
        int[] ans = new int[len1 + len2];

        while (i < len1 && j < len2) {
            if (arr1[i] <= arr2[j]) {
                ans[k] = arr1[i];
                i++;
                k++;
            } else {
                ans[k] = arr2[j];
                j++;
                k++;
            }
        }

        while (i < len1) {
            ans[k] = arr1[i];
            i++;
            k++;
        }

        while (j < len2) {
            ans[k] = arr2[j];
            j++;
            k++;
        }

        return ans;
    }
}
