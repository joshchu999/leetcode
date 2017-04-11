package idv.joshchu999.exercise.leetcode.algmonopoly;

import java.math.BigInteger;

/**
 * Created by joshchu999 on 4/4/17.
 */
public class Solution {
    public BigInteger monopoly(int target) {

        BigInteger[] moves = new BigInteger[target + 1];

        moves[0] = new BigInteger("1");

        BigInteger sum = new BigInteger("0");

        for (int i = 1 ; i < moves.length ; i++) {

            if (i > 6) {
                sum = sum.subtract(moves[i - 7]);
            }

            sum = sum.add(moves[i - 1]);

            moves[i] = new BigInteger(sum.toString());

            System.out.println("i = " + i + ", moves = " + moves[i]);
        }

        return moves[target];
    }
}
