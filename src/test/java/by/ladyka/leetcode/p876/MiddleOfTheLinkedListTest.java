package by.ladyka.leetcode.p876;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

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

    private static void assertListNodes(ListNode expected, ListNode result) {
        do {
            Assertions.assertEquals(expected.val, result.val);
            result = result.next;
            expected = expected.next;
        } while (result != null);
    }
}