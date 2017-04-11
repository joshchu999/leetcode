package idv.joshchu999.exercise.leetcode.alg322;

import java.util.Arrays;

/**
 * Created by joshchu999 on 4/4/17.
 */
public class Solution {

    private int recursive(int[] coins, int amount, int[] results) {

        int result = -1;

        if (coins.length > 0) {

            if (amount < 0) {
                ;
            }
            else if (results[amount] != -2) {
                result = results[amount];
            }
            else {

                for (int i = 0; i < coins.length; i++) {

                    int temp = this.recursive(coins, amount - coins[i], results);

                    if (temp != -1) {
                        if ((result == -1) || (result > (1 + temp))) {
                            result = 1 + temp;
                        }
                    }
                }
                results[amount] = result;
            }
        }

        return result;
    }

    public int coinChange(int[] coins, int amount) {

        int[] results = new int[amount + 1];

        results[0] = 0;
        for (int i = 1 ; i <= amount ; i++) {
            results[i] = -2;
        }

        return this.recursive(coins, amount, results);
    }
}
