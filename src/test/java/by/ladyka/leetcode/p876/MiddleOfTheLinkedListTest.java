package by.ladyka.leetcode.p876;

import by.ladyka.leetcode.common.ListNode;
import org.junit.jupiter.api.Test;

import static by.ladyka.leetcode.common.ListNodeAssertions.assertListNodes;


class MiddleOfTheLinkedListTest {

    MiddleOfTheLinkedList solution = new MiddleOfTheLinkedList();

    @Test
    void middleNode1() {
        ListNode result = solution.middleNode(ListNode.of(new int[]{1, 2, 3, 4, 5}));
        ListNode expected = ListNode.of(new int[]{3, 4, 5});
        assertListNodes(expected, result);
    }
    @Test
    void middleNode2() {
        ListNode result = solution.middleNode(ListNode.of(new int[]{1, 2, 3, 4, 5}));
        ListNode expected = ListNode.of(new int[]{3, 4, 5});
        assertListNodes(expected, result);
    }
    @Test
    void middleNode3() {
        ListNode result = solution.middleNode(ListNode.of(new int[]{1}));
        ListNode expected = ListNode.of(new int[]{1});
        assertListNodes(expected, result);
    }
}