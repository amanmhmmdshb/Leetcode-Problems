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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null || head.next == null){
            return null;
        }
        ListNode dummy = new ListNode(0, head);
        ListNode left = dummy;
        ListNode right = head;
        while(n>0){
            right = right.next;
            n--;
        }
        while(right!= null){
            left = left.next;
            right = right.next;
        }
        left.next = left.next.next;
        return dummy.next;
    }
    public ListNode removeNth(ListNode head, int n){
        int len =0;
        ListNode temp = head;
        while(temp!= null){
            temp = temp.next;
            len++;
        }
        temp = head;
        if(n==len){
            return head.next;
        }
        for(int i=0; i<len-n-1; i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return head;
    }
}
