package StriverSDESheet.CodingNinjasQuestions.arrays;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[] arr = {100, 4, 200, 1, 3, 2};
        int output = longestConSeq(arr);
        System.out.println(output);
    }

    public static int longestConSeq(int[] arr) {
        // Base case
        if (arr.length == 0) {
            return 0;
        }

        int longest = 1;
        Set<Integer> set = new HashSet<>();

        for (int value : arr) {
            set.add(value);
        }

        for (int value : set) {
            if (!set.contains(value - 1)) {
                int count = 1;
                int x = value;

                while (set.contains(x + 1)) {
                    x = x + 1;
                    count = count + 1;
                }
                longest = Math.max(longest, count);
            }
        }
        return longest;
    }
}
