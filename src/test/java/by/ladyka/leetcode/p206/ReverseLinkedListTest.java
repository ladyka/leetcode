package by.ladyka.leetcode.p206;

import by.ladyka.leetcode.common.ListNode;
import org.junit.jupiter.api.Test;

import static by.ladyka.leetcode.common.ListNodeAssertions.assertListNodes;
import static org.junit.jupiter.api.Assertions.*;

class ReverseLinkedListTest {
    ReverseLinkedList solution = new ReverseLinkedList();

    @Test
    void reverseList1() {
      ListNode result = solution.reverseList(ListNode.of(new int[]{1, 2, 3, 4, 5}));
      ListNode expected = ListNode.of(new int[]{5,4,3,2,1});
      assertListNodes(expected, result);
    }
    @Test
    void reverseList2() {
      ListNode result = solution.reverseList(ListNode.of(new int[]{1, 2}));
      ListNode expected = ListNode.of(new int[]{2,1});
      assertListNodes(expected, result);
    }
    @Test
    void reverseList3() {
      ListNode result = solution.reverseList(null);
      ListNode expected = null;
      assertListNodes(expected, result);
    }
}