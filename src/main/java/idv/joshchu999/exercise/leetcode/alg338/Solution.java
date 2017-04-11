package idv.joshchu999.exercise.leetcode.alg338;

/**
 * Created by joshchu999 on 4/4/17.
 */
public class Solution {
    public int[] countBits(int num) {

        int[] result = new int[num + 1];

        result[0] = 0;

        if (num > 0) {

            result[1] = 1;

            int pivot = 2;

            for (int i = 2, j = 0; i <= num; i++, j++) {

                if (j == pivot) {
                    pivot *= 2;
                    j = 0;
                }

                result[i] = result[j] + 1;
            }
        }

        return result;
    }
}
