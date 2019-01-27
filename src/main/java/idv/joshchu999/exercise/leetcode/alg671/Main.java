package idv.joshchu999.exercise.leetcode.alg671;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by joshchu999 on 4/4/17.
 */
public class Main {
    public static void main(String[] args) {

        Solution solution = new Solution();

        TreeNode root = null;
        int expected = 0;
        int answer = 0;
        String format = "%d, %d";

        root = new TreeNode(2);
        root.left = new TreeNode(2);
        TreeNode rootRight = new TreeNode(5);
        rootRight.left = new TreeNode(5);
        rootRight.right = new TreeNode(7);
        root.right = rootRight;
        expected = 5;
        answer = solution.findSecondMinimumValue(root);
        System.out.println(String.format(format, expected, answer));

        root = new TreeNode(2);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        expected = -1;
        answer = solution.findSecondMinimumValue(root);
        System.out.println(String.format(format, expected, answer));
    }
}
