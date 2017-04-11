package idv.joshchu999.exercise.leetcode.alg39;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by joshchu999 on 4/4/17.
 */
public class Solution {

    private List<List<Integer>> treeSearch(int[] candidates, int target, int index) {

        List<List<Integer>> result = new ArrayList<List<Integer>>();

        if (target == 0) {
            result.add(new ArrayList<Integer>());
        }
        else {
            for (int i = index ; i < candidates.length ; i++) {
                if (candidates[i] > target) {
                    break;
                }
                else {
                    List<List<Integer>> temp = this.treeSearch(candidates, target - candidates[i], i);
                    for (List<Integer> tempElement : temp) {
                        tempElement.add(candidates[i]);
                        result.add(tempElement);
                    }
                }
            }
        }

        return result;
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> result = this.treeSearch(candidates, target, 0);
        for (List<Integer> l: result) {
            Collections.reverse(l);
        }
        return result;
    }
}
