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
        int count = 1;
        ListNode node = head;
        while (count < n) {
            node = node.next;
            count++;
        }

        ListNode curr = null;
        while (node.next != null) {
            if (curr == null) {
                curr = head;
            } else {
                curr = curr.next;
            }
            node = node.next;
        }

        if (curr == null) {
            return head.next;
        }

        curr.next = curr.next.next;

        return head;
    }
}
