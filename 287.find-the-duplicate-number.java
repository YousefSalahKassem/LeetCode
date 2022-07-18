import java.util.Arrays;

/*
 * @lc app=leetcode id=287 lang=java
 *
 * [287] Find the Duplicate Number
 */

// @lc code=start
class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==nums[i+1]){
                return nums[i];
            }
        }
        return 0;
    }
}
// @lc code=end

