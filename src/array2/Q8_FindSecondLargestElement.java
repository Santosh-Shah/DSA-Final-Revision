package array2;

public class Q8_FindSecondLargestElement {
    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
    public static void main(String[] args) {
// TODO:        Q8) Find second largest element of the array and return it;
        int[] arr = {1, 3, 7, 10, 102, 12, 100};
        System.out.println("Second Largest Element: " + secLargest(arr));

    }

    public static int secLargest(int[] arr) {
        int len = arr.length;
        int largest = Integer.MIN_VALUE;
        int secLargest = Integer.MIN_VALUE;
       for (int i = 0; i < len; i++) {
           if (arr[i] > largest) {
               secLargest = largest;
               largest = arr[i];
           }

           if (arr[i] < largest && arr[i] > secLargest) {
               secLargest = arr[i];
           }
       }
       return secLargest;
    }
}
