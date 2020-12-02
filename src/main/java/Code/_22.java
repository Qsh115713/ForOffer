package Code;

import java.util.ArrayList;
import java.util.List;

public class _22 {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        helper(res, "", n, 0, 0);
        return res;
    }

    private void helper(List<String> res, String str, int n, int a, int b) {
        if (a == n && b == n) {
            res.add(str);
            return;
        }
        if (a < n) {
            helper(res, str + '(', n, a + 1, b);
        }
        if (b < a) {
            helper(res, str + ')', n, a, b + 1);
        }
    }
}
