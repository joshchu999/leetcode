package idv.joshchu999.leetcode.alg35;

/**
 * Created by joshchu999 on 4/4/17.
 */
public class Solution {
    public int searchInsert(int[] nums, int target) {

        int result = 0;

        for (result = 0 ; result < nums.length ; result++) {
            if (nums[result] >= target) {
                break;
            }
        }

        return result;
    }
}
