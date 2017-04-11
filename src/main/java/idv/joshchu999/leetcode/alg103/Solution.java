package idv.joshchu999.leetcode.alg103;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by joshchu999 on 4/4/17.
 */
public class Solution {

    private void traverse(TreeNode node, List<List<Integer>> result, int level) {

        if (null != node) {

            while (result.size() < level) {
                result.add(new ArrayList<Integer>());
            }

            if (level % 2 == 0) {
                result.get(level - 1).add(0, node.val);
            } else {
                result.get(level - 1).add(node.val);
            }

            traverse(node.left, result, level + 1);
            traverse(node.right, result, level + 1);
        }
    }


    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        List<List<Integer>> result = new ArrayList<List<Integer>>();
        traverse(root, result, 1);
        return result;
    }
}
