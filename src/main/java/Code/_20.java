package Code;

import Data.ListNode;

import java.util.List;
import java.util.Stack;

public class _20 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) return false;
                char tmp = stack.peek();
                if (tmp == '(' && ch == ')' || tmp == '[' && ch == ']' || tmp == '{' && ch == '}')
                    stack.pop();
                else return false;
            }
        }
        return stack.isEmpty();
    }

}
