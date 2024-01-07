package revision_once.arrays.medium;

public class Q9_CheckArrayRotation {
    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
    public static void main(String[] args) {
// TODO:        Q9) Check array rotation and return index where rotation starts
        int[] arr = {5, 6, 7, 8, 0, 1, 2, 3, 4};
        System.out.println("Rotations starts from at index: " + checkArrayRotation(arr));
    }

    public static int checkArrayRotation(int[] arr) {
        if (arr.length == 0) {
            return -1;
        }

        int len = arr.length;
        int value = arr[0];
        int index = 0;
        for (int i = 0; i < len; i++) {
            if (value > arr[i]) {
                index = i;
                value = arr[i];
            }
        }

        return index;
    }
}
