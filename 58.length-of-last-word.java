/*
 * @lc app=leetcode id=58 lang=java
 *
 * [58] Length of Last Word
 */

// @lc code=start
class Solution {
    public int lengthOfLastWord(String s) {
        return s.trim().substring(s.trim().lastIndexOf(" ")+1).length();
    }
}
// @lc code=end

