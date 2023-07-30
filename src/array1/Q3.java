package array1;

public class Q3 {
    public static void main(String[] args) {
        // TODO: Linear Search
        //  if found return it's index
        // if not found return -1
        int[] arr = {4, 3, 50, 6, 10, 1, 8};
        System.out.println("Index of the targeted element: " + linearSearch(arr, 50));
    }

    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
