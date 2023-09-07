package recursion.part2;

public class Q4_RemoveDuplicates {
    public static void main(String[] args) {
        String str = "aabbccd";
        String ans = removeConsecutiveDuplicates(str);
        System.out.println(ans);
    }

    // Method to remove duplicates
    public static String removeConsecutiveDuplicates(String str) {
        if (str.length() <= 1) {
            return str;
        }

        if (str.charAt(0) == str.charAt(1)) {
            return removeConsecutiveDuplicates(str.substring(1));
        } else {
            String small = removeConsecutiveDuplicates(str.substring(1));
            return str.charAt(0) + small;
        }
    }
}
