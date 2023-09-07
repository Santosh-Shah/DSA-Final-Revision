package recursion.part2;

public class Q3_ReplacePI {
    public static void main(String[] args) {
        String string = "appiabp";
        System.out.println(replacePI(string));
    }

    // Method to replace PI with 3.14
    public static String replacePI(String s) {
        // Base case
        if (s.length() <= 1) {
            return s;
        }

        if (s.charAt(0) == 'p' && s.charAt(1) == 'i') {
            String smallOutput = replacePI(s.substring(2));
            return "3.14" + smallOutput;
        } else {
            String smallOutput = replacePI(s.substring(1));
            return s.charAt(0) + smallOutput;
        }
    }
}
