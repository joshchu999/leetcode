package idv.joshchu999.exercise.leetcode.alg396;

import java.util.Arrays;

/**
 * Created by joshchu999 on 4/4/17.
 */
public class Main {
    public static void main(String[] args) {

        Solution solution = new Solution();

        int[] a = null;
        int expected = 0;
        int answer = 0;
        String format = "%s -> %d (%d)";

        // [4, 3, 2, 6] -> 26
        a = new int[]{4, 3, 2, 6};
        expected = 26;
        answer = solution.maxRotateFunction(a);
        System.out.println(String.format(format, Arrays.toString(a), expected, answer));

        // [5, 2, 8, 3, 6, 1] -> 75
        a = new int[]{5, 2, 8, 3, 6, 1};
        expected = 75;
        answer = solution.maxRotateFunction(a);
        System.out.println(String.format(format, Arrays.toString(a), expected, answer));
    }
}
