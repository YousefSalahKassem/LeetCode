/*
 * @lc app=leetcode id=9 lang=java
 *
 * [9] Palindrome Number
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(int x) {
        int r;
        int sum=0;
        int target=x;
        while (x!=0) {
            r=x%10;
            sum=(sum*10)+r;
            x/=10;
        }
        if(target!=sum || target<0) return false;
        else return true;
    }
}
// @lc code=end

