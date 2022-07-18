/*
 * @lc app=leetcode id=4 lang=java
 *
 * [4] Median of Two Sorted Arrays
 */

// @lc code=start
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double sum=0;
        int m = nums1.length;
        int n = nums2.length;
        int [] both = Arrays.copyOf(nums1, nums1.length + nums2.length);
        System.arraycopy(nums2, 0, both, nums1.length, nums2.length);
        Arrays.sort(both);
        if(both.length%2!=0){
            return both[(m+n)/2];
        }
        else {
            int x = (m+n)/2;
            double p = both[x];
            double q= both[x-1];
            return (p+q)/2;
        }
    }
}
// @lc code=end

