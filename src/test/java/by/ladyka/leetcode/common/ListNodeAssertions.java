package by.ladyka.leetcode.common;

import org.junit.jupiter.api.Assertions;

public class ListNodeAssertions {
    public static void assertListNodes(ListNode expected, ListNode actual) {
        if (expected == null) {
            Assertions.assertNull(actual);
            return;
        }
        do {
            Assertions.assertEquals(expected.val, actual.val);
            actual = actual.next;
            expected = expected.next;
        } while (actual != null);
    }
}
