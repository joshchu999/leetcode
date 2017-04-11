package idv.joshchu999.leetcode.alg338;

import java.util.Arrays;

/**
 * Created by joshchu999 on 4/4/17.
 */
public class Main {
    public static void main(String[] args) {

        Solution solution = new Solution();

        int num = 0;
        int[] expected = null;
        int[] answer = null;
        String format = "%d -> %s (%s)";

        for (int i = 0 ; i < 40 ; i++) {
            num = i;
            expected = null;
            answer = solution.countBits(num);
            System.out.println(String.format(format, num, expected, Arrays.toString(answer)));
        }
    }
}
