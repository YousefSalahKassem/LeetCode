import java.util.HashMap;
import java.util.List;

/*
 * @lc app=leetcode id=1 lang=java
 *
 * [1] Two Sum
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int answer [] = new int[2];
        HashMap<Integer,Integer> hash =new HashMap<Integer,Integer>();
        for (int i = 0; i < nums.length; i++) {
            if(hash.containsKey(target-nums[i])){
                answer[0]=hash.get(target-nums[i]);
                answer[1]=i;
                return answer;
            }
            else{
                hash.put(nums[i], i);
            }
        } 
        return answer;
    }
}
// @lc code=end

