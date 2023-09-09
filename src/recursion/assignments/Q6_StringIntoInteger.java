package recursion.assignments;

public class Q6_StringIntoInteger {
    public static void main(String[] args) {
        System.out.println(convertStringToInteger("425"));
    }

    // Method to convert string into integer
    public static int convertStringToInteger(String input) {
        if (input.length() == 1) {
            return input.charAt(0) - '0';    // it is substracting from '4' - '0' means 52 - 48 = 4;
                                            // from 0th character's value - '0' values;
        }

        int smallOutput = convertStringToInteger(input.substring(0, input.length()-1));
        int lastDigit = input.charAt(input.length()-1) - '0';
        return smallOutput * 10 + lastDigit;
    }
}
