package revision_once.arrays.medium;

public class Q6_PushZeroToEnd {
    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 0, 7, 0, 0, 12, 0};
        pushZeroToEnd(arr);
        printArray(arr);

    }

    public static void pushZeroToEnd(int[] arr) {
        int len = arr.length;
        int i = 0;
        int j = 0;
        while (i < len) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j++;
            } else {
                i++;
            }
        }
    }
}
