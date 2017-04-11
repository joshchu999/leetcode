package idv.joshchu999.exercise.leetcode.alg357;

/**
 * Created by joshchu999 on 4/4/17.
 */
public class Solution {

    private int p(int m, int n) {

        int result = 1;

        for (int i = 0 ; i < n ; i++) {
            result *= (m - i);
        }

        return result;
    }

    public int countNumbersWithUniqueDigits(int n) {

        // n = 1, 1 + p(9, 1)
        // n = 2, 1 + p(9, 1) + p(9, 1) * p(9, 1)
        // n = 3, 1 + p(9, 1) + p(9, 1) * p(9, 1) + p(9, 1) * p(9, 2)
        // n = 4, 1 + p(9, 1) + p(9, 1) * p(9, 1) + p(9, 1) * p(9, 2) + p(9, 1) * p(9, 3)
        // ...
        // n = m, 1 + p(9, 1) * sigma(m, k = 1)p(9, k - 1)
        // The biggest n is 9

        int result = 1;

        int sum = 0;

        for (int i = 0 ; i < n ; i++) {
            sum += this.p(9, i);
        }

        result += (this.p(9, 1) * sum);

        return result;
    }
}
