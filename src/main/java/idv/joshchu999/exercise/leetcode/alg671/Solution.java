package idv.joshchu999.exercise.leetcode.alg671;

import java.util.*;

/**
 * Created by joshchu999 on 4/4/17.
 */
public class Solution {

    public int findSecondMinimumValue(TreeNode root) {

        Queue<TreeNode> expands = new LinkedList<TreeNode>();

        int sMin = -1;
        expands.offer(root);

        while (expands.peek() != null) {
            TreeNode expand = expands.poll();
            if (expand.left != null) {
                if (expand.val == expand.left.val) {
                    expands.offer(expand.left);
                } else if (sMin == -1 || expand.left.val < sMin) {
                    sMin = expand.left.val;
                } else {
                    ;
                }
            }
            if (expand.right != null) {
                if (expand.val == expand.right.val) {
                    expands.offer(expand.right);
                } else if (sMin == -1 || expand.right.val < sMin) {
                    sMin = expand.right.val;
                } else {
                    ;
                }
            }
        }

        return sMin;
    }
}
