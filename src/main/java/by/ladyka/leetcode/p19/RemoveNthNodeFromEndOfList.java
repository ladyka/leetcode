package by.ladyka.leetcode.p19;

import by.ladyka.leetcode.common.ListNode;

import java.util.ArrayList;
import java.util.List;

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
public class RemoveNthNodeFromEndOfList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode headCalculateLenght = head;
        List<ListNode> nodes = new ArrayList<>(30);
        do {
            nodes.add(headCalculateLenght);
            headCalculateLenght = headCalculateLenght.next;
        } while (headCalculateLenght != null);


        int positionToRemove = nodes.size() - n;
        if (positionToRemove == 0) {
            head = head.next;
            return head;
        }
        ListNode previous = nodes.get(positionToRemove - 1);

        int nextPosition = positionToRemove + 1;
        if (nextPosition < nodes.size()) {
            previous.next = nodes.get(nextPosition);
            System.out.println(head);
        } else {
            previous.next = null;
        }

        return head;
    }
}