package by.ladyka.leetcode.common;
public class ListNode {
     public int val;
     public ListNode next;
     public ListNode() {}
     public ListNode(int val) { this.val = val; }
     public ListNode(int val, ListNode next) { this.val = val; this.next = next; }

     public static ListNode of(int[] ints) {
          if (ints.length == 0) {
               return new ListNode();
          }
          if (ints.length == 1) {
               return new ListNode(ints[0]);
          }
          ListNode node = new ListNode(ints[ints.length -1]);
          for (int i = ints.length - 2; i > -1; i--) {
               int val = ints[i];
              node = new ListNode(val, node);
          }
          return node;
     }

     @Override
     public String toString() {
          return "ListNode{" +
                  "val=" + val +
                  ", next=" + next +
                  '}';
     }
}