package recursion.part2;

public class Q2_RemoveX {
    public static void main(String[] args) {
        System.out.println(removeX("abcrxdkjx"));
    }

    // method to remove x from string
    public static String removeX(String input) {
        if (input.length() == 0) {
            return "";
        }

        if(input.charAt(0) == 'x') {
            return removeX(input.substring(1));
        }

        return input.charAt(0) + removeX(input.substring(1));
    }
}
