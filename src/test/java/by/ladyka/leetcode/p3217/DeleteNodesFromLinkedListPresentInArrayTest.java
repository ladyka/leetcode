package by.ladyka.leetcode.p3217;

import by.ladyka.leetcode.common.ListNode;
import org.junit.jupiter.api.Test;

import static by.ladyka.leetcode.common.ListNodeAssertions.assertListNodes;

class DeleteNodesFromLinkedListPresentInArrayTest {
    DeleteNodesFromLinkedListPresentInArray solution = new DeleteNodesFromLinkedListPresentInArray();

    @Test
    void modifiedList1() {
        ListNode result = solution.modifiedList(new int[]{1, 2, 3}, ListNode.ofInts(1, 2, 3, 4, 5));
        assertListNodes(ListNode.ofInts(4, 5), result);
    }

    @Test
    void modifiedList2() {
        ListNode result = solution.modifiedList(new int[]{1}, ListNode.ofInts(1, 2, 1, 2, 1, 2));
        assertListNodes(ListNode.ofInts(2, 2, 2), result);
    }

    @Test
    void modifiedList3() {
        ListNode result = solution.modifiedList(new int[]{5}, ListNode.ofInts(1, 2, 3, 4));
        assertListNodes(ListNode.ofInts(1, 2, 3, 4), result);
    }

    @Test
    void modifiedList4() {
        ListNode result = solution.modifiedList(new int[]{1}, ListNode.ofInts(7));
        assertListNodes(ListNode.ofInts(7), result);
    }

    @Test
    void modifiedList5() {
        ListNode result = solution.modifiedList(new int[]{9, 2, 5}, ListNode.ofInts(2, 10, 9));
        assertListNodes(ListNode.ofInts(10), result);
    }
}