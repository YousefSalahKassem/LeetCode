/*
 * @lc app=leetcode id=509 lang=java
 *
 * [509] Fibonacci Number
 */

// @lc code=start
class Solution {
    public int fib(int n) {
        int result =0;
        int first=0;
        int second =1;
        if(n==0) return first;
        if(n==1) return second;
       for (int i=2;i<=n;i++){
        result=first+second;
        first=second;
        second=result;
       } 
        return result;  
    }
}
// @lc code=end

