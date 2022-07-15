/*
 * @lc app=leetcode id=70 lang=java
 *
 * [70] Climbing Stairs
 */

// @lc code=start
class Solution {
    public int climbStairs(int n) {
        if(n<2){
            return n;
        }
        int first =1;
        int second =2;
        for(int i=3;i<=n;i++){
            int next= first+second;
            first=second;
            second=next;
        }
        return second;
    }
}
// @lc code=end

