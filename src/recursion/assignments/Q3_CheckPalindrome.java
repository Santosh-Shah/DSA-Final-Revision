package recursion.assignments;

public class Q3_CheckPalindrome {
    public static void main(String[] args) {
        String str = "racecar";
        System.out.println(checkPalindrome(str, 0, str.length() - 1));
    }

    // Method to solve palindrome or not if yes then return true or false
    public static boolean checkPalindrome(String str, int s, int e) {
        // Base Case
        if (str.length() == 0) {
            return true;
        }

        if (s >= e) {
            return true;
        }

        if (str.charAt(s) == str.charAt(e)) {
            return checkPalindrome(str, s + 1, e - 1);
        }
        return false;
    }
}
