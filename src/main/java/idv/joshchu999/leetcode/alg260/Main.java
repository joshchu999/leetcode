package idv.joshchu999.leetcode.alg260;

import java.util.Arrays;
import java.util.List;

/**
 * Created by joshchu999 on 4/4/17.
 */
public class Main {
    public static void main(String[] args) {

        Solution solution = new Solution();

        int[] nums = null;
        int[] expected = null;
        int[] answer = null;
        String format = "%s -> %s (%s)";

        // [1, 2, 1, 3, 2, 5] -> [3, 5]
        nums = new int[]{1, 2, 1, 3, 2, 5};
        expected = new int[]{3, 5};
        answer = solution.singleNumber(nums);
        System.out.println(String.format(format, Arrays.toString(nums), Arrays.toString(expected), Arrays.toString(answer)));

        // [5, 2, 1, 3, 3, 5] -> [2, 1]
        nums = new int[]{5, 2, 1, 3, 3, 5};
        expected = new int[]{2, 1};
        answer = solution.singleNumber(nums);
        System.out.println(String.format(format, Arrays.toString(nums), Arrays.toString(expected), Arrays.toString(answer)));

    }
}
