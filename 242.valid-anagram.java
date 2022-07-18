/*
 * @lc app=leetcode id=242 lang=java
 *
 * [242] Valid Anagram
 */

// @lc code=start
class Solution {
    public boolean isAnagram(String s, String t) {
        char[] a =s.toCharArray();
        Arrays.sort(a);
        char[] b =t.toCharArray();
        Arrays.sort(b);
        if(String.valueOf(a).equals(String.valueOf(b))){
            return true;
        }
        else return false;
    }
}
// @lc code=end

