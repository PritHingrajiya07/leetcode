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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode first = head;

        while(first != null && first.next != null){
        if(first.val == first.next.val ){
            first.next = first.next.next;
        }
        else{
            first = first.next;
        }
        }
        return head;
    }
}