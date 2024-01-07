package revision_once.arrays.medium;

public class Q11_SumOfTwoArray {
    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
// TODO:        Q11) Sum of two array
        int[] arr1 = {9, 2, 8};
        int[] arr2 = {7, 5};
        int[] output = new int[Math.max(arr1.length, arr2.length) + 1];
        sumOfTwoArray(arr1, arr2, output);
        printArray(output);
    }

    public static void sumOfTwoArray(int[] arr1, int[] arr2, int[] output) {
        int i = arr1.length - 1;
        int j = arr2.length - 1;
        int k = output.length - 1;
        int carry = 0;

        while (i >= 0 && j >= 0) {
            int sum = arr1[i] + arr2[j] + carry;
            output[k] = sum % 10;
            carry = sum / 10;
            i--;
            j--;
            k--;
        }

        while (i >= 0) {
            int sum = arr1[i] + carry;
            output[k] = sum % 10;
            carry = sum / 10;
            i--;
            k--;
        }

        while (j >= 0) {
            int sum = arr1[j] + carry;
            output[k] = sum % 10;
            carry = sum / 10;
            j--;
            k--;
        }

        output[k] = carry;
    }
}
