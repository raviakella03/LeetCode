/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // ListNode prevNode = null;
        // ListNode currNode = head;
        // int ipLen = 0;
        // while(null != currNode) {
        //     ++ipLen;
        //     currNode = currNode.next;
        // }
        // prevNode = head;
        // currNode = head;
        // int count = 0;
        // if(n > ipLen) {
        //     return head;
        // } else if(ipLen == 1 && n == 1) {
        //     return null;
        // } else if(ipLen - n == 0) {
        //     head = head.next;
        //     return head;
        // }
        // while(null != currNode) {
        //     if(count == ipLen - n) {
        //         prevNode.next = currNode.next;
        //         break;
        //     }
        //     ++count;
        //     prevNode = currNode;
        //     currNode = currNode.next;
        // }
        ListNode startNode = new ListNode(0);
        ListNode slowRider = startNode;
        ListNode fastRider = startNode;
        slowRider.next = head;
        for(int i = 1; i <= n + 1; i++) {
            fastRider = fastRider.next;
        }

        while(null != fastRider) {
            slowRider = slowRider.next;
            fastRider = fastRider.next;
        }
        slowRider.next = slowRider.next.next;
        return startNode.next;
    }
}