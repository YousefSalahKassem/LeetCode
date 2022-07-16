/*
 * @lc app=leetcode id=125 lang=java
 *
 * [125] Valid Palindrome
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder(s.toLowerCase()); // for later comparisons
        int index = 0;  
        while (index < sb.length()) {
          char ch = sb.charAt(index);
          if (Character.isLetterOrDigit(ch)) { 
            index += 1;
          } else {
            sb.deleteCharAt(index);
          }
        }
        int n = sb.length(); 
        for (int i = 0; i < n / 2; ++i) { 
          int j = n - i - 1;
          if (sb.charAt(i) != sb.charAt(j)) {
            return false;
          }
        }
        return true;
      }
}
// @lc code=end

