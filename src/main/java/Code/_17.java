package Code;

import java.util.ArrayList;
import java.util.List;

public class _17 {
    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        if (digits == null || digits.equals("")) {
            return res;
        }
        String[] s = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        helper(res, s, digits, 0, "");
        return res;
    }

    private void helper(List<String> res, String[] s, String digits, int index, String str) {
        if (index == digits.length()) {
            res.add(str);
            return;
        }
        int k = digits.charAt(index) - '0';
        for (int i = 0; i < s[k].length(); i++) {
            helper(res, s, digits, index + 1, str + s[k].charAt(i));
        }
    }
}
