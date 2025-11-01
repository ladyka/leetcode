package by.ladyka.leetcode.p3217;

import by.ladyka.leetcode.common.ListNode;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

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
 * You are given an array of integers nums and the head of a linked list.
 * Return the head of the modified linked list after removing all nodes from the linked list
 * that have a value that exists in nums.
 */
class DeleteNodesFromLinkedListPresentInArray {
    public ListNode modifiedList(int[] nums, ListNode head) {
        Set<Integer> numSet = Arrays.stream(nums).boxed().collect(Collectors.toSet());

        if (head == null) {
            return null;
        }
        if (head.next == null) {
            if (numSet.contains(head.val)) {
                return null;
            }
        }
        ListNode prev = new ListNode(0, head);
        ListNode h = head;
        while (h != null) {
            if (numSet.contains(h.val)) {
                if (h.next != null) {
                    h.val = h.next.val;
                    h.next = h.next.next;
                } else {
                    prev.next = null;
                    h = null;
                }
            } else {
                prev = h;
                h = h.next;
            }
        };

        return head;
    }
}