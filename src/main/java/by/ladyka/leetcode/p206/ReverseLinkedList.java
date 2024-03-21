package by.ladyka.leetcode.p206;

import by.ladyka.leetcode.common.ListNode;
/**
 * Given the head of a singly linked list, reverse the list, and return the reversed list.
 * <p>
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode tall = null;
        ListNode headNext;
        ListNode reverseNext;
        while (head != null) {
            headNext = head.next;
            reverseNext = tall;
            tall = head;
            tall.next = reverseNext;
            head = headNext;
        }
        return tall;
    }
}
