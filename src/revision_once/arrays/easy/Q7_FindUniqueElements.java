package revision_once.arrays.easy;

public class Q7_FindUniqueElements {
    public static void main(String[] args) {
        // TODO: find unique elements
        int[] arr = {5, 8, 5, 8, 4, 4, 10, 3, 3};
        System.out.println("Unique element: " + findUniqueElement(arr));
    }

    public static int findUniqueElement(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum ^= i;
        }

        return sum;
    }
}
