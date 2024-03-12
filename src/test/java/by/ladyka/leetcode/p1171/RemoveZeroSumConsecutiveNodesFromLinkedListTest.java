package by.ladyka.leetcode.p1171;

import by.ladyka.leetcode.common.ListNode;
import org.junit.jupiter.api.Test;

import static by.ladyka.leetcode.common.ListNodeAssertions.assertListNodes;

class RemoveZeroSumConsecutiveNodesFromLinkedListTest {
    RemoveZeroSumConsecutiveNodesFromLinkedList solution = new RemoveZeroSumConsecutiveNodesFromLinkedList();

    //  Note: The answer [1,2,1] would also be accepted.
    @Test
    void removeZeroSumSublists1() {
        ListNode result = solution.removeZeroSumSublists(ListNode.of(new int[]{1, 2, -3, 3, 1}));
        ListNode expected = ListNode.of(new int[]{3, 1});
        assertListNodes(expected, result);
    }

    @Test
    void removeZeroSumSublists2() {
        ListNode result = solution.removeZeroSumSublists(ListNode.of(new int[]{1, 2, 3, -3, 4}));
        ListNode expected = ListNode.of(new int[]{1, 2, 4});
        assertListNodes(expected, result);
    }

    @Test
    void removeZeroSumSublists3() {
        ListNode result = solution.removeZeroSumSublists(ListNode.of(new int[]{1, 2, 3, -3, -2}));
        ListNode expected = ListNode.of(new int[]{1});
        assertListNodes(expected, result);
    }
    @Test
    void removeZeroSumSublists4() {
        ListNode result = solution.removeZeroSumSublists(ListNode.of(new int[]{-1, 1}));
        ListNode expected = null;
        assertListNodes(expected, result);
    }

    @Test
    void removeZeroSumSublists5() {
        ListNode result = solution.removeZeroSumSublists(ListNode.of(new int[]{0, 0}));
        ListNode expected = null;
        assertListNodes(expected, result);
    }
    @Test
    void removeZeroSumSublists6() {
        ListNode result = solution.removeZeroSumSublists(ListNode.of(new int[]{0, 1, -1}));
        ListNode expected = null;
        assertListNodes(expected, result);
    }
}