package idv.joshchu999.exercise.leetcode.alg260;

import java.util.*;

/**
 * Created by joshchu999 on 4/4/17.
 */
public class Solution {

    public int[] singleNumber(int[] nums) {

        // This answer is not constant space complexity

        Map<Integer, Integer> foundMap = new HashMap<Integer, Integer>();

        for (int i = 0 ; i < nums.length ; i++) {
            int tempInt = nums[i];

            if (null == foundMap.get(tempInt)) {
                foundMap.put(tempInt, tempInt);
            }
            else {
                foundMap.remove(tempInt);
            }
        }

        int[] result = new int[2];

        int index = 0;
        for (int i : foundMap.keySet()) {
            result[index++] = i;
        }

        return result;
    }
}
