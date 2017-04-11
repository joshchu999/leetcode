package idv.joshchu999.leetcode.alg35;

/**
 * Created by joshchu999 on 4/4/17.
 */
public class Main {
    public static void main(String[] args) {

        Solution solution = new Solution();

        int[] nums = null;
        int target = 0;
        int expected = 0;
        int answer = 0;
        String format = "%s, %d -> %d (%d)";

        // [1,3,5,6], 5 -> 2
        nums = new int[]{1,3,5,6};
        target = 5;
        expected = 2;
        answer = solution.searchInsert(nums, target);
        System.out.println(String.format(format, nums, target, expected, answer));

        // [1,3,5,6], 2 -> 1
        nums = new int[]{1,3,5,6};
        target = 2;
        expected = 1;
        answer = solution.searchInsert(nums, target);
        System.out.println(String.format(format, nums, target, expected, answer));

        // [1,3,5,6], 7 -> 4
        nums = new int[]{1,3,5,6};
        target = 7;
        expected = 4;
        answer = solution.searchInsert(nums, target);
        System.out.println(String.format(format, nums, target, expected, answer));

        // [1,3,5,6], 0 -> 0
        nums = new int[]{1,3,5,6};
        target = 0;
        expected = 0;
        answer = solution.searchInsert(nums, target);
        System.out.println(String.format(format, nums, target, expected, answer));


        // [], 3 -> 0
        nums = new int[]{};
        target = 3;
        expected = 0;
        answer = solution.searchInsert(nums, target);
        System.out.println(String.format(format, nums, target, expected, answer));
    }
}
