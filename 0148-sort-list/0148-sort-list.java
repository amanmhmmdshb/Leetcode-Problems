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
    private ListNode mergeList(ListNode left, ListNode right){
        ListNode dummy = new ListNode();
        ListNode curr = dummy;
        while(left!= null && right !=null){
            if(left.val<right.val){
                curr.next = left;
                left = left.next;
            }
            else {
                curr.next = right;
                right = right.next;
            }
            curr = curr.next;
        }
        if(left!= null){
            curr.next = left;
        }
        if(right!= null){
            curr.next = right;
        }
        return dummy.next;
    }
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }    
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast!= null && fast.next!= null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode left = head;
        ListNode right = slow.next;
        slow.next = null;

        left = sortList(left);
        right = sortList(right);
        return mergeList(left, right);
    }
}