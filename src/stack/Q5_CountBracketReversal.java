package stack;

import java.util.Stack;

public class Q5_CountBracketReversal {
    // TODO: method to count bracket reversal
    public static int countBracketReversals(String input) {
        //Your code goes here
        if(input.length() % 2 == 1)  {
            return -1;
        }

        Stack<Character> s = new Stack<>();
        int count = 0;

        for(int i = 0; i < input.length(); i++) {
            if(input.charAt(i) != '}') {
                s.push(input.charAt(i));
            } else if(input.charAt(i) == '}' && (s.isEmpty() == true || s.peek() == '}')) {
                s.push(input.charAt(i));
            } else if(input.charAt(i) == '}' && (s.peek() == '{' && s.isEmpty() != true)) {
                s.pop();
            } else if(input.charAt(i) == '}') {
                s.push(input.charAt(i));
            }

        }

        while(!s.isEmpty()) {
            char c1 = s.pop();
            char c2 = s.pop();

            if(c1 == c2) {
                count++;
            } else if(c1 == '{' && c2 == '}') {
                count+=2;
            }
        }
        return count;
    }


    public static void main(String[] args) {
        System.out.println(countBracketReversals("{{{{}}"));
    }
}
