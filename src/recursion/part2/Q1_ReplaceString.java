package recursion.part2;

public class Q1_ReplaceString {
    public static void main(String[] args) {
        System.out.println(replaceChar("abxdxcpx", 'x', 'y'));
    }

    // replace character with another character
    public static String replaceChar(String s, char a, char b) {
        // Base chase
        if (s.length() == 0) {
            return s;
        }

        String smallOutput = replaceChar(s.substring(1), a, b);
        if (s.charAt(0) == a) {
            return b + smallOutput;
        } else {
            return s.charAt(0) + smallOutput;
        }
    }
}
