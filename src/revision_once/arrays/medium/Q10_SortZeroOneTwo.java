package revision_once.arrays.medium;

public class Q10_SortZeroOneTwo {
    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
    public static void main(String[] args) {
// TODO:        Q10) Sort 0 1 2
        int[] arr = {2, 0, 1, 0, 1, 2, 1, 2, 2, 0, 0, 1};
        sortZeroOneTwo(arr);
        printArray(arr);
    }


    public static void sortZeroOneTwo(int[] arr) {
        int zerosC = 0;
        int onesC = 0;
        int twos = 0;
        for (int j : arr) {
            if (j == 0) {
                zerosC++;
            } else if (j == 1) {
                onesC++;
            } else {
                twos++;
            }
        }

        for (int i = 0; i < zerosC; i++) {
            arr[i] = 0;
        }

        for (int i = zerosC; i < zerosC + onesC; i++) {
            arr[i] = 1;
        }

        for (int i = zerosC + onesC; i < arr.length; i++) {
            arr[i] = 2;
        }
    }
}
