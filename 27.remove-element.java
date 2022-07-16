import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/*
 * @lc app=leetcode id=27 lang=java
 *
 * [27] Remove Element
 */

// @lc code=start
class Solution {
    public int removeElement(int[] nums, int val) {
        int sum=0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]!=val){
                nums[sum]=nums[i];
                sum++;
            }
        }
        return sum;
    }
}
// @lc code=end

