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
    public ListNode middleNode(ListNode head) {
        ListNode currNode = head;
        int ipLen = 0;
        while(null != currNode) {
            ++ipLen;
            currNode = currNode.next;
        }
        ipLen = ipLen / 2;
        while(ipLen > 0) {
            head = head.next;
            --ipLen;
        }
        return head;
    }
}