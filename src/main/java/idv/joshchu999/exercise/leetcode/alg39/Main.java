package idv.joshchu999.exercise.leetcode.alg39;

import java.util.List;

/**
 * Created by joshchu999 on 4/4/17.
 */
public class Main {
    public static void main(String[] args) {

        Solution solution = new Solution();

        int[] candidates = null;
        int target = 0;
        List<List<Integer>> expected = null;
        List<List<Integer>> answer = null;
        String format = "%s, %d -> %s (%s)";

        // [2, 3, 6, 7], 7 -> [[7], [2, 2, 3]]
        candidates = new int[]{2, 3, 6, 7};
        target = 7;
//        expected = 2;
        answer = solution.combinationSum(candidates, target);
        System.out.println(String.format(format, candidates, target, expected, answer));

        // [2, 4, 8], 8 -> [[2, 2, 2, 2], [2, 2, 4], [4, 4], [8]]
        candidates = new int[]{2, 4, 8};
        target = 8;
//        expected = 1;
        answer = solution.combinationSum(candidates, target);
        System.out.println(String.format(format, candidates, target, expected, answer));

    }
}
