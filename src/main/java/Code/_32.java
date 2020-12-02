package Code;

import Data.ListNode;

import java.util.*;

public class _23 {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) return null;
        ListNode p = new ListNode(0), dump = p;
        Queue<ListNode> q = new PriorityQueue<>(Comparator.comparingInt((ListNode o) -> o.val));
        for (ListNode item : lists) {
            if (item != null) q.add(item);
        }
        while (!q.isEmpty()) {
            p.next = q.poll();
            p = p.next;
            if (p.next != null) q.add(p.next);
        }
        return dump.next;
    }
}
