package hashmaps;

import java.util.HashMap;

public class Q3_PrintIntersection {
    public static void main(String[] args) {
        int[] arr1 = {1, 4, 5, 2, 2, 3, 6, 5, 3, 2};
        int[] arr2 = {0, 2, 3, 2, 6, 6, 5, 1};
        printIntersection(arr1, arr2);
    }

    public static void printIntersection(int[] arr1, int[] arr2) {
        HashMap<Integer, Integer> map = new HashMap<>();

        // putting all elements of array1 = O(m)
        for (int i : arr1) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }

        // comparing elements of array2 = O(n)
        for (int i : arr2) {
            if (map.containsKey(i)) {
                if (map.get(i) > 0) {
                    System.out.print(i + " ");
                    map.put(i, map.get(i) - 1);
                }
            }
        }
    }
}
