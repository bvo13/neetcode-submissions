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
    public ListNode reverseList(ListNode head) {
        if(head==null){
            return null;
        }
        ListNode reversed = new ListNode(head.val);
        ListNode og = head.next;
        
        while(og!=null){
            ListNode head2 = new ListNode(og.val,reversed);
            reversed=head2;
            og=og.next;
        }
        return reversed;
    }
}
