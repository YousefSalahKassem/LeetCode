/*
 * @lc app=leetcode id=21 lang=java
 *
 * [21] Merge Two Sorted Lists
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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode a=list1;
        ListNode b=list2;
        ListNode dummy= new ListNode(0);
        ListNode tail=dummy;

            while (a!=null&&b!=null) {
                if (a.val<=b.val) {
                    tail.next=a;
                    a=a.next;
                } else {
                    tail.next=b;
                    b=b.next;
                }
                tail=tail.next;
            }
            if (a==null) {
                tail.next=b;
            }else{
                tail.next=a;
            }
            return dummy.next;
    }
}
// @lc code=end

