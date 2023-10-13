package hashmaps;

import java.util.HashMap;

public class Q8_LengthOfLongestSubsetWithZeroSum {
    public static void main(String[] args) {
        int[] arr1 = {2, 4, -2, -3, 1, 0, 5, -1};
        int result1 = lengthOfLongestSubsetWithZeroSum(arr1);
        System.out.println("The length of the longest subset with a zero sum in arr1 is: " + result1);

    }

    public static int lengthOfLongestSubsetWithZeroSum(int arr[]) {
        if (arr.length == 0) {
            return 0;
        }

        // Create a HashMap to store the running sum as keys and their corresponding index as values.
        HashMap<Integer, Integer> sumToIndexMap = new HashMap<>();

        int sum = 0; // Initialize the running sum to 0.
        int maxLength = 0; // Initialize the maximum length of the subset with a zero sum.

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i]; // Update the running sum by adding the current element.

            // Check if the current sum already exists in the HashMap.
            if (sumToIndexMap.containsKey(sum)) {
                int previousIndex = sumToIndexMap.get(sum);
                int currentLength = i - previousIndex;

                // Update maxLength if the current subset has a longer length.
                if (currentLength > maxLength) {
                    maxLength = currentLength;
                }
            } else {
                // If the current sum doesn't exist in the HashMap, store it along with its index.
                sumToIndexMap.put(sum, i);
            }

            // Check if the current sum is 0.
            if (sum == 0) {
                // If the current sum is 0, it means the subset from the beginning to the current element has a zero sum.
                maxLength = i + 1;
            }
        }

        return maxLength;
    }
}
