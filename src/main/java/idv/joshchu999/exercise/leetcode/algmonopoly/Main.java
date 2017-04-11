package idv.joshchu999.exercise.leetcode.algmonopoly;

import java.math.BigInteger;

/**
 * Created by joshchu999 on 4/4/17.
 */
public class Main {
    public static void main(String[] args) {

        Solution solution = new Solution();

        int target = 0;
        BigInteger expected = null;
        BigInteger answer = null;
        String format = "%d -> %s (%s)";

        // 2 -> 2
        target = 2;
        expected = new BigInteger("2");
        answer = solution.monopoly(target);
        System.out.println(String.format(format, target, expected, answer));

        // 3 -> 4
        target = 3;
        expected = new BigInteger("4");
        answer = solution.monopoly(target);
        System.out.println(String.format(format, target, expected, answer));

        // 4 -> 8
        target = 4;
        expected = new BigInteger("8");
        answer = solution.monopoly(target);
        System.out.println(String.format(format, target, expected, answer));

        // 8 -> 125
        target = 8;
        expected = new BigInteger("125");
        answer = solution.monopoly(target);
        System.out.println(String.format(format, target, expected, answer));

        // 610 -> x
        target = 610;
        expected = new BigInteger("0");
        answer = solution.monopoly(target);
        System.out.println(String.format(format, target, expected, answer));

    }
}
