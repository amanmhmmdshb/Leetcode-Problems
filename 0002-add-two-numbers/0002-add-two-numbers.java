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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode();
        ListNode curr = dummy;
        int carry =0;
        while(l1!= null || l2!= null || carry ==1){
            int val = carry + (l1!=null? l1.val:0) + (l2!=null? l2.val:0);
            carry = val/10;
            val = val%10;
            curr.next = new ListNode(val);
            curr = curr.next;
            l1 = l1!=null? l1.next:null;
            l2 = l2!=null? l2.next:null;
        }
        return dummy.next;
    }
}