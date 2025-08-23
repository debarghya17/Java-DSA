class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = null, tail = null;

        while (list1 != null && list2 != null) {
            ListNode next;
            if (list1.val <= list2.val) {
                next = list1;
                list1 = list1.next;
            } else {
                next = list2;
                list2 = list2.next;
            }

            if (head == null) {
                head = tail = next;
            } else {
                tail.next = next;
                tail = tail.next;
            }
        }

        if (tail != null) {
            tail.next = (list1 != null) ? list1 : list2;
        } else {
            head = (list1 != null) ? list1 : list2;
        }

        return head;
    }
}
