package Code;

import Data.ListNode;

public class _21 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode res = new ListNode(0), l = res;
        while (l1 != null || l2 != null) {
            if (l2 == null || l1 != null && l1.val < l2.val) {
                l.next = l1;
                l1 = l1.next;
            } else {
                l.next = l2;
                l2 = l2.next;
            }
            l = l.next;
        }
        return res.next;
    }
}
