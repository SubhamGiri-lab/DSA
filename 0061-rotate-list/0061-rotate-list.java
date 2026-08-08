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
        
        if(head == null || head.next == null || k == 0){
            return head;
        }
        int n = 1;
        ListNode temp = head;

        while(temp.next != null){
            temp = temp.next;
            n++;
        }

        k = k % n;
        if(k == 0) return head;

        int steps = n - k - 1;

        ListNode firstHalf = head;
        ListNode fHead = firstHalf;
        for(int i = 0; i < steps; i++){
            firstHalf = firstHalf.next;
        }

        ListNode newHead = firstHalf.next;
        firstHalf.next = null;
        temp.next = head;

        return newHead;
    }
}