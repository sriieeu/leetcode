/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode c1 = headA;
        ListNode c2 = headB;
        int count1 =0;
        int count2 = 0;
        while(c1!= null){
            c1=c1.next;
            count1++;
        }
        while(c2!= null){
            c2=c2.next;
            count2++;
        }
        c1=headA;
        

        for(int i =0 ; i< count1 ;i++){
            c2=headB;
            for(int j = 0 ; j<count2 ;j++ ){
                if(c1== c2){
                    return c1;
                }
                c2 = c2.next;
            }
              c1 = c1.next;
        }
        return null;
    }
}