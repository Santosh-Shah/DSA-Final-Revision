package hashmaps;

import java.util.ArrayList;
import java.util.HashMap;

public class Q7_PairCount {
    public static void main(String[] args) {
        int[] arr = {5, 1, 2, 4};
        System.out.println("Pair count with difference k: " + getPairsWithDifferenceK(arr, 3));
    }

    public static int getPairsWithDifferenceK(int arr[], int k) {
        // Create a HashMap to store the frequency of each element in the array.
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int pairCount = 0; // Initialize the count of pairs to 0.

        // Iterate through the elements in the array.
        for (int i : arr) {
            // Calculate the two possible pairs: i + k and i - k.
            int p1 = i + k;
            boolean flag = false;

            // If i == p1, it means that i - k would be equal to i,
            // so we need to avoid counting the pair twice.
            if (i == p1) {
                flag = true;
            }

            // Check if the pair i + k exists in the HashMap,
            // and add its frequency to the pairCount variable.
            if (map.containsKey(p1)) {
                pairCount += map.get(p1);
            }

            // Calculate the second possible pair: i - k.
            int p2 = i - k;

            // Check if the pair i - k exists in the HashMap,
            // and add its frequency to the pairCount variable.
            if (map.containsKey(p2) && !flag) {
                pairCount += map.get(p2);
            }

            // Update the frequency of the current element in the HashMap.
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }

        return pairCount; // Return the total count of pairs with the given difference k.
    }
}
