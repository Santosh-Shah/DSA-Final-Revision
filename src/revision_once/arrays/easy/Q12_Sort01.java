package revision_once.arrays.easy;

public class Q12_Sort01 {
    public static void main(String[] args) {
        // TODO: sort 0 1.
        int[] arr = {1, 1, 0, 1, 0, 0, 1};
        sortZeroOne(arr);
        printArray(arr);
    }

    public static int[] sortZeroOne(int[] arr) {
        int len = arr.length;
        int zerosCount = zeroCount(arr);
        int onesCount = oneCount(arr);

        int i = 0;
        while (i < zerosCount) {
            arr[i] = 0;
            i++;
        }

        while (i < len) {
            arr[i] = 1;
            i++;
        }

        return arr;
    }

    public static int zeroCount(int[] arr) {
        int zeroCount = 0;
        for (int j : arr) {
            if (j == 0) {
                zeroCount++;
            }
        }
        return zeroCount;
    }

    public static int oneCount(int[] arr) {
        int oneCount = 0;
        for (int j : arr) {
            if (j == 1) {
                oneCount++;
            }
        }
        return oneCount;
    }

    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
