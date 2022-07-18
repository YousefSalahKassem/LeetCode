/*
 * @lc app=leetcode id=520 lang=java
 *
 * [520] Detect Capital
 */

// @lc code=start
class Solution {
    public boolean detectCapitalUse(String word) {
       return word.equals(word.toLowerCase())
        ||word.equals(word.toUpperCase())
        ||word.substring(1).equals(word.substring(1).toLowerCase());
    }
}
// @lc code=end

