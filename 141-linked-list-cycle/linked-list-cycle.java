/**
 * Definition for singly-linked list.
 * class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) {
 * val = x;
 * next = null;
 * }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode slowRider = head;
        ListNode fastRider = head;
        if (null == head) {
            return false;
        }
        while (true) {
            if (null == slowRider.next || null == fastRider.next || null == fastRider.next.next) {
                return false;
            } else if ((slowRider.next == fastRider.next.next)) {
                return true;
            } else {
                slowRider = slowRider.next;
                fastRider = fastRider.next.next;
            }
        }
    }
}