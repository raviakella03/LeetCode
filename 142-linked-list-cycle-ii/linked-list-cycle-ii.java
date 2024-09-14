/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;
        while(null != fast && null != fast.next) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) {
                break;
            }
        }

        if(null == fast || null == fast.next) {
            return null;
        }

        while(head != slow) {
            head = head.next;
            slow = slow.next;
        }
        return head;
        
    }
}