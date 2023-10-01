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
        ListNode dummyA = headA;
        ListNode dummyB = headB;
        int lenA = 0;
        while(dummyA!= null){
            lenA++;
            dummyA = dummyA.next;
        }
        dummyA = headA;
        int lenB=0;
        while(dummyB!= null){
            lenB++;
            dummyB = dummyB.next;
        }
        dummyB = headB;
        if(lenA>lenB){
            int diff = lenA - lenB;
            while(diff>0){
                dummyA = dummyA.next;
                diff--;
            }
        }
        else {
            int diff = lenB - lenA;
            while(diff>0){
                dummyB = dummyB.next;
                diff--;
            }
        }
        while(dummyA!= null && dummyB!= null){
            if(dummyA == dummyB){
                return dummyA;
            }
            dummyA=dummyA.next;
            dummyB= dummyB.next;
        }
        return null;

    }
}