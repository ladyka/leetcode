package by.ladyka.leetcode.p1171;

import by.ladyka.leetcode.common.ListNode;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 * <p>
 * Given the head of a linked list, we repeatedly delete consecutive sequences of nodes that sum to 0 until there are no such sequences.
 * After doing so, return the head of the final linked list.  You may return any such answer.
 * (Note that in the examples below, all sequences are serializations of ListNode objects.)
 * <p>
 * consecutive - запар, паслядоўны
 * <p>
 * Constraints:
 * The given linked list will contain between 1 and 1000 nodes.
 * Each node in the linked list has -1000 <= node.val <= 1000.
 */
public class RemoveZeroSumConsecutiveNodesFromLinkedList {
    public ListNode removeZeroSumSublists(ListNode head) {
        ListNode zero = new ListNode(Integer.MIN_VALUE, head);
        ListNode current = zero;
        while (current != null && current.next != null) {
            boolean hasCut = findAndRemoveZeroSumSublists(current, current.next);
            if (!hasCut)
                current = current.next;
        }

        if (zero.next != null && zero.next.next == null && zero.next.val == 0) {
            return null;
        }
        return zero.next;
    }

    private boolean findAndRemoveZeroSumSublists(ListNode previous, ListNode current) {
        int sequenceSum = 0;
        do {
            sequenceSum += current.val;
            if (sequenceSum == 0) {
                previous.next = current.next;
                return true;
            }
            current = current.next;
        } while (current != null);
        return false;
    }
}
