package array2;

public class Q10_SortZeroOneTwo {
    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
    public static void main(String[] args) {
// TODO:        Q10) Sort 0 1 2
        int[] arr = {1, 0, 1, 2, 1, 2, 2, 0, 0, 1};
        sortZeroOneTwo(arr);
        printArray(arr);
    }

    public static void sortZeroOneTwo(int[] arr) {
        int countOnes = 0;
        int countTwos = 0;
        int countZeros = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                countZeros++;
            }

            if (arr[i] == 1) {
                countOnes++;
            }

            if (arr[i] == 2) {
                countTwos++;
            }
        }

        for (int i = 0; i < countZeros; i++) {
            arr[i] = 0;
        }

        for (int i = countZeros; i < (countZeros + countOnes); i++) {
            arr[i] = 1;
        }

        for (int i = (countZeros + countOnes); i < arr.length; i++) {
            arr[i] = 2;
        }
    }
}
