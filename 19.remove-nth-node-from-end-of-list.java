/*
 * @lc app=leetcode id=19 lang=java
 *
 * [19] Remove Nth Node From End of List
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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode current=head;
            int count=0;
            if(head.next==null) return null;
            while(current!=null){
                current=current.next;
                count++;
            }
            int position=count-n;

            if (position==0) {
                head=head.next;
                return head;
            }
            current=head;
            for(int i=0; i<=position; i++){
                if(i==position-1){
                    current.next = current.next.next;
                    break;
                }
                current = current.next;
            }
            return head;
    }
}
// @lc code=end

