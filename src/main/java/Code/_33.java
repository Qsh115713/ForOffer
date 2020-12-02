package Code;

import java.util.Stack;

public class _32 {
    public int longestValidParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        int max = 0;
        int left = -1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') stack.push(i);
            else {
                if (stack.empty()) left = i;
                else {
                    stack.pop();
                    if (stack.empty()) max = Math.max(max, i - left);
                    else max = Math.max(max, i - stack.peek());
                }
            }
        }
        return max;
    }
}
