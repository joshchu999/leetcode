package idv.joshchu999.exercise.leetcode.alg396;

/**
 * Created by joshchu999 on 4/4/17.
 */
public class Solution {

    public int maxRotateFunction(int[] A) {

        // F(k) = F(k - 1) + Sum(A) - n * A[n - k]

        int result = 0;

        int n = A.length;

        int sum = 0;

        int f = 0;

        for (int i = 0 ; i < n ; i++) {
            sum += A[i];
            f += (i * A[i]);
        }

        result = f;

        for (int i = 1 ; i < n ; i++) {
            f += (sum - n * A[n - i]);
            System.out.println(i + ":" + f);
            if (f > result) result = f;
        }

        return result;
    }
}
