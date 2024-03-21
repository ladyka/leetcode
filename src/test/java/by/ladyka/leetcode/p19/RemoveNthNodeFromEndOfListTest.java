package by.ladyka.leetcode.p19;

import by.ladyka.leetcode.common.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RemoveNthNodeFromEndOfListTest {
    RemoveNthNodeFromEndOfList solution = new RemoveNthNodeFromEndOfList();

    @Test
    void removeNthFromEnd1() {
        ListNode result = solution.removeNthFromEnd(ListNode.of(new int[]{1, 2, 3, 4, 5}), 2);
        ListNode expected = ListNode.of(new int[]{1, 2, 3, 5});
        assertListNodes(expected, result);
    }
    @Test
    void removeNthFromEnd2() {
        ListNode result = solution.removeNthFromEnd(ListNode.of(new int[]{1}), 1);
        assert result == null;
    }
    @Test
    void removeNthFromEnd3() {
        ListNode result = solution.removeNthFromEnd(ListNode.of(new int[]{1, 2}), 1);
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