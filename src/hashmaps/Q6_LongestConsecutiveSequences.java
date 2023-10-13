package hashmaps;

import java.util.ArrayList;
import java.util.HashMap;

public class Q6_LongestConsecutiveSequences {
    public static void main(String[] args) {
        int[] arr = {9, 1, 8, 6, 3, 4, 2, 7, 10, 15};
        System.out.println("Longest Consecutive Sequences: " + longestConsecutiveSequences(arr));
    }

    public static ArrayList<Integer> longestConsecutiveSequences(int[] arr) {
        HashMap<Integer, Boolean> map = new HashMap<>();
        HashMap<Integer, Integer> lenMap = new HashMap<>();
        ArrayList<Integer> output = new ArrayList<>();

        // all elements storing into map
        for (int i : arr) {
            map.put(i, true);
        }

        int maxStart = -1;
        int maxLength = 0;
        boolean startCheck = true;

        for (int i : arr) {
            if (map.get(i)) {
                int currStart = i;
                int currLen = 1;
                boolean flag = true;
                map.put(i, false);

                int ahead = i + 1;
                while (flag) {
                    if (map.containsKey(ahead)) {
                        currLen = currLen + 1;
                        map.put(ahead, false);
                        ahead = ahead + 1;
                    } else {
                        flag = false;
                    }
                }

                flag = true;
                int before = i - 1;
                while (flag) {
                    if (map.containsKey(before)) {
                        currLen = currLen + 1;
                        currStart = before;
                        map.put(before, false);
                        before = before - 1;
                    } else {
                        flag = false;
                    }
                }

                // putting maxStart and maxlen into lenMap
                if (currLen >= maxLength) {
                    maxLength = currLen;
                    maxStart = currStart;
                    lenMap.put(maxStart, maxLength);
                }
            }
        }

        // finding the maximum length and max start in lenMap
        for (int i : arr) {
            if (lenMap.containsKey(i) && lenMap.get(i) >= maxLength) {
                maxLength = lenMap.get(i);
                maxStart = i;
                break;
            }
        }

        output.add(maxStart);
        output.add(maxStart + maxLength - 1);
        return output;
    }
}
