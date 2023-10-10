package hashmaps;

import java.util.ArrayList;
import java.util.HashMap;

public class Q1_RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6, 3, 2, 5, 4};
        ArrayList<Integer> output = removeDuplicates(arr);
        System.out.println(output);
    }

    private static ArrayList<Integer> removeDuplicates(int[] arr) {
        // Base case
        if (arr == null) {
            return null;
        }

        ArrayList<Integer> output = new ArrayList<>();
        HashMap<Integer, Boolean> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                continue;
            }
            output.add(arr[i]);
            map.put(arr[i], true);
        }
        return output;
    }
}
