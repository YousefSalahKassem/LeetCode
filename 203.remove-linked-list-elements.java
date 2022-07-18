/*
 * @lc app=leetcode id=203 lang=java
 *
 * [203] Remove Linked List Elements
 */

// @lc code=start
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
    public ListNode removeElements(ListNode head, int val) {
        if(head == null) return null;
        while(head != null && head.val == val)
            head = head.next;
        ListNode handler = head;
        while(handler != null && handler.next != null)
        {
            if(handler.next.val == val)
            {
                handler.next = handler.next.next;
            }
            else
            {
                handler = handler.next;
            }
        }
        return head;
    }
}
// @lc code=end

