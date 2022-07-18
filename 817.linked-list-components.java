/*
 * @lc app=leetcode id=817 lang=java
 *
 * [817] Linked List Components
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
    public int numComponents(ListNode head, int[] nums) {
        ListNode current=head;
        int count=0;
        Set<Integer> set = new HashSet<>();
        boolean  isconnected =false;
        for(int entry:nums){
            set.add(entry);
        }
        while(current!=null){
            if (set.contains(current.val)) {
                if(isconnected==false){
                    isconnected = true;
                    count++;
                }
            }
                else{
                    isconnected = false;
                }
                current=current.next;
            }
        return count;
    }
}
// @lc code=end

