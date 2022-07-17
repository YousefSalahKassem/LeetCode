import java.util.Arrays;

/*
 * @lc app=leetcode id=344 lang=java
 *
 * [344] Reverse String
 */

// @lc code=start
class Solution {
    public void reverseString(char[] s) {
        int x=0,y=s.length-1;
        char temp;
        while(x<y)
    {
        temp=s[x];
        s[x]=s[y];
        s[y]=temp;
    y--;
    x++;
    }
    }
}
// @lc code=end

