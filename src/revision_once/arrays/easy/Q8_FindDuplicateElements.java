package revision_once.arrays.easy;

public class Q8_FindDuplicateElements {
    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 12, 10, 11, 12};
        System.out.println("duplicate: " + findDuplicate(arr));


    }

    public static int findDuplicate(int[] arr) {
            for (int i = 0; i < arr.length - 1; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        return arr[j];
                    }
                }
            }
            return -1;
    }
}
