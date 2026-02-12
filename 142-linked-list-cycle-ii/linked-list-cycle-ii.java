/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode first =head;
        ListNode second =head;
        boolean isCycle = false;
        if(head == null || head.next== null){
            return null;
        }
       while (second != null && second.next != null){
            first = first.next;
            second = second.next.next;
            if(first == second){
                isCycle = true;
                break;
            } 
            }
        if (!isCycle) {
            return null;   // no cycle
        }
        first =head;
        first = head;

        while (first != second) {
            first = first.next;
             second = second.next;
}

return first;

    }
}