package revision_once.arrays.medium;

public class Q7_RotateArray {
    public static void main(String[] args) {
        int[] arr = {1, 3, 7, 10, 102, 12, 100};
        rotateArray(arr, 4);
        printArray(arr);
    }

    public static void rotateArray(int[] arr, int rotateC) {
        int len = arr.length;
        int[] temp = new int[rotateC];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = arr[i];
        }

        int j = 0;
        for (int i = temp.length; i < len; i++) {
            arr[j++] = arr[i];
        }

        for (int i = 0; i < temp.length; i++) {
            arr[j++] = temp[i];
        }
    }

    public static void printArray(int[] arr) {
        for (int output : arr) {
            System.out.print(output + " ");
        }
    }
}
