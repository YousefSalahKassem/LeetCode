/*
 * @lc app=leetcode id=35 lang=java
 *
 * [35] Search Insert Position
 */

// @lc code=start
class Solution {
    public int searchInsert(int[] nums, int target) {
        int result =0;
        for (int i = 0; i < nums.length; i++) {
            if (target==nums[i]) {
                result = i;
            }
            else if(target>nums[i]){
                result= i+1;
            }
        }
        return result;
    }
}
// @lc code=end

