package stack;

import java.util.Stack;

public class Q3_CheckRedundantBrackets {
    // TODO: method to check redundant brackets
    public static boolean checkRedundantBrackets(String exp) {
        Stack<Character> stk = new Stack<>();
        for (int i = 0; i < exp.length(); ++i) {
            if (exp.charAt(i) == '(' || find(exp.charAt(i))) {
                stk.push(exp.charAt(i));
            } else if (exp.charAt(i) == ')') {
                boolean hasOperator = false;

                while (!stk.isEmpty() && stk.peek() != '(') {
                    stk.pop();
                    hasOperator = true;
                }

                if (!hasOperator) {
                    return true;
                }

                if (!stk.isEmpty()) {
                    stk.pop();
                }
            }
        }
        return false;
    }

    private static boolean find(char ch) {
        if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
            return true;
        }

        return false;
    }


    public static void main(String[] args) {
        System.out.println(checkRedundantBrackets("a+(a)+b"));

    }
}
