package hashmaps;

import java.util.HashMap;

public class Q4_PairSumEqualZero {
    public static void main(String[] args) {
        int[] arr = {2, 1, -2, 2, 3};
        int ans = pairSumEqualsToZero(arr, arr.length);
        System.out.println("Pair sum: " + ans);
    }

    public static int pairSumEqualsToZero(int[] arr, int size) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int i = 0; i < size; i++) {
            int complement = -arr[i];
            if (map.containsKey(complement)) {
                count = count + map.get(complement);
            }
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);  // if key already exit then increase its value
        }
        return count;
    }
}
