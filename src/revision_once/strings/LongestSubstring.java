package revision_once.strings;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {
    public static String longestSubstring(String s) {
        int n = s.length();
        int maxLength = 0;
        String longest = "";

        for (int i = 0; i < n; i++) {
            Set<Character> set = new HashSet<>();
            StringBuilder current = new StringBuilder();

            for (int j = i; j < n; j++) {
                char c = s.charAt(j);
                if (set.contains(c)) {
                    break;
                }
                set.add(c);
                current.append(c);
            }

            if (current.length() > maxLength) {
                maxLength = current.length();
                longest = current.toString();
            }
        }

        return longest;
    }

    public static void main(String[] args) {
//        String input = "sswetaarajjchhauddhary";
        String input = "aabcdeffgghh";
        String longest = longestSubstring(input);
        System.out.println("Longest substring without repeating characters: " + longest);
    }
}
