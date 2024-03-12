package by.ladyka.leetcode.p876;

import by.ladyka.leetcode.common.ListNode;

import java.util.ArrayList;
import java.util.List;

public class MiddleOfTheLinkedList {
    public ListNode middleNode(ListNode head) {
        ListNode headCalculateLenght = head;
        List<ListNode> nodes = new ArrayList<>(30);
        do {
            nodes.add(headCalculateLenght);
            headCalculateLenght = headCalculateLenght.next;
        } while (headCalculateLenght != null);


        int positionFromSecondPart = nodes.size() / 2;
        if (positionFromSecondPart == 0) {
            return head;
        }

        return nodes.get(positionFromSecondPart);
    }
}
