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
        if (head == null){
            return null;
        }
        if (head.next == null){
            return head;
        }

        ListNode preNode = null; 
        ListNode currNode = head;

        while (currNode != null){
            //save next before you break it
            ListNode nextNode = currNode.next;

            // flip it 
            currNode.next = preNode;

            //advancing to next
            preNode = currNode; 
            currNode = nextNode; 
     
        }
        head = preNode;

        return head;
    }
}
