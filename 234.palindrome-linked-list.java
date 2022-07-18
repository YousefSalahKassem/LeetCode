/*
 * @lc app=leetcode id=234 lang=java
 *
 * [234] Palindrome Linked List
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

    public static ListNode findMiddle(ListNode head){
        ListNode fast=head;
        ListNode slow=head;
        while (fast!=null&&fast.next!=null) {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

    public static ListNode reverseLinkedList(ListNode head){
        if(head==null){return head;}

        ListNode current=head;
        ListNode previous = null;
        ListNode next=null;

        while (current!=null) {
            next=current.next;
            current.next=previous;
            previous=current;
            current=next;
        }
        return previous;
    }

    public boolean isPalindrome(ListNode head) {
        ListNode current=head;
        ListNode middle=findMiddle(current);
        ListNode reverse= reverseLinkedList(middle);

        while (current!=null&&reverse!=null) {
            if(current.val==reverse.val){
                current=current.next;
                reverse=reverse.next;
            }
            else{
                return false;
            }
        }
        return true;
    }
}
// @lc code=end

