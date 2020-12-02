package Code;

import Data.ListNode;

import java.util.List;

public class _19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (n <= 0) return head;
        ListNode dump = new ListNode(0);
        dump.next = head;
        ListNode pre = dump, p = dump;
        while (p.next != null) {
            p = p.next;
            if (n-- <= 0) pre = pre.next;
        }
        if (n <= 0) {
            pre.next = pre.next.next;
        }
        return dump.next;
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
