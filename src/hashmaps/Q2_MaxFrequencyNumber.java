package hashmaps;

import java.util.ArrayList;
import java.util.HashMap;

public class Q2_MaxFrequencyNumber {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 4, 2, 4, 5, 6, 3, 2, 5, 4};
        System.out.println("Maximum frequency number: " + maxFrequencyNumber(arr));
    }

    private static int maxFrequencyNumber(int[] arr) {
        // Base case
        if (arr.length == 0) {
            return 0;
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        // putting all element into hashmap
        for (int all : arr) {
            if (map.containsKey(all)) {
                map.put(all, map.get(all) + 1);
            } else {
                map.put(all, 1);
            }
        }

        // taking max frequency number
        int max = 0;
        int ans = Integer.MIN_VALUE;
        for (int all : arr) {
            if (map.get(all) > max) {
                max = map.get(all);
                ans = all;
            }
        }
        return ans;
    }
}
