package array2;

public class Q7_RotateArray {
    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 3, 7, 10, 102, 12, 100};
        rotateArray(arr, 3);
        printArray(arr);

    }

    public static void rotateArray(int[] arr, int rNum) {
        int len = arr.length;
        int[] temp = new int[rNum];
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
}
