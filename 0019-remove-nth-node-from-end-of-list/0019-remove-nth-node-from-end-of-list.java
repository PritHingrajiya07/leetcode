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
        
        int len = 0;
        for(ListNode current = head; current != null; current = current.next){
            len ++;
        }

        if(len == n){
            head = head.next;
            return head;
        }

        int ind = 1;
        ListNode current = head;
        while(ind < len -n){
            current = current.next;
            ind++;
        }

        current.next = current.next.next;
        return head;

        
    }
}