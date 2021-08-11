package Stack;

import java.util.Arrays;
import java.util.Stack;

public class BalancedExpression {
    public boolean isBalanced(String input) {
        Stack<Character> stack = new Stack<>();
        for (char ch : input.toCharArray()) {
            if (isLeftBracket(ch)) {
                stack.push(ch);
            } else if (isRightBracket(ch)) {
                if (stack.isEmpty())
                    return false;

                char top = stack.pop();
                if (top == '(' && ch == ')' || top == '[' && ch == ']' || top == '{' && ch == '}'
                        || top == '<' && ch == '>')
                    continue;
                else
                    break;

            }
        }
        return stack.empty();
    }

    private boolean isLeftBracket(char ch) {
        var leftBrackets = Arrays.asList('(', '[', '{', '<');
        return leftBrackets.contains(ch);
    }

    private boolean isRightBracket(char ch) {
        var rightBrackets = Arrays.asList(')', ']', '}', '>');
        return rightBrackets.contains(ch);
    }
}
