import java.util.List;

/*
 * @lc app=leetcode id=206 lang=java
 *
 * [206] Reverse Linked List
 */

// @lc code=start

//   public class ListNode {
//       int val;
//       ListNode next;
//       ListNode() {}
//       ListNode(int val) { this.val = val; }
//       ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//   }

class Solution {
    public ListNode reverseList(ListNode head) {
        if (head==null) {
            return head;
        }
        ListNode current=head;
        ListNode previous=null;
        ListNode next=null;

        while(current!=null){
            next=current.next;
            current.next=previous;
            previous=current;
            current=next;
        }
        return previous;
    }
}
// @lc code=end

