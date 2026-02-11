class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode total = new ListNode(-1);
        ListNode head = total;

        if (list1 == null) return list2;
        if (list2 == null) return list1;

        while (list1 != null && list2 != null) {  

            if (list1.val <= list2.val) {          
                total.next = list1;
                list1 = list1.next;
            } else {
                total.next = list2;
                list2 = list2.next;
            }

            total = total.next;                    
        }

        if (list1 != null) {
            total.next = list1;
        } else {
            total.next = list2;
        }

        return head.next;
    }
}
