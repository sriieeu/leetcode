/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        int count =1;
         if (head == null || head.next == null)
            return head;
        ListNode first =head;
        ListNode curr = head;
        while(first.next !=null){
            first =first.next;
            count++;
        }
        first.next = head;
         k = k % count;
        for(int i= 0 ; i<(count-k-1); i++){
            curr=curr.next;
        }
        ListNode newHead = curr.next;
        curr.next = null;
        return newHead;
    }
}