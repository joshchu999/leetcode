package idv.joshchu999.leetcode.alg166;

import java.util.Arrays;

/**
 * Created by joshchu999 on 4/4/17.
 */
public class Main {
    public static void main(String[] args) {

        Solution solution = new Solution();

        int numerator = 0;
        int denominator = 0;
        String expected = "";
        String answer = "";
        String format = "%d, %d -> %s (%s)";

        // 1, 2 -> 0.5
        numerator = 1;
        denominator = 2;
        expected = "0.5";
        answer = solution.fractionToDecimal(numerator, denominator);
        System.out.println(String.format(format, numerator, denominator, expected, answer));

        // 2, 1 -> 1
        numerator = 2;
        denominator = 1;
        expected = "2";
        answer = solution.fractionToDecimal(numerator, denominator);
        System.out.println(String.format(format, numerator, denominator, expected, answer));

        // 2, 3 -> 0.(6)
        numerator = 2;
        denominator = 3;
        expected = "0.(6)";
        answer = solution.fractionToDecimal(numerator, denominator);
        System.out.println(String.format(format, numerator, denominator, expected, answer));

        // 1, 5 -> 0.2
        numerator = 1;
        denominator = 5;
        expected = "0.2";
        answer = solution.fractionToDecimal(numerator, denominator);
        System.out.println(String.format(format, numerator, denominator, expected, answer));

        // 1, 7 -> 0.(142857)
        numerator = 1;
        denominator = 7;
        expected = "0.(142857)";
        answer = solution.fractionToDecimal(numerator, denominator);
        System.out.println(String.format(format, numerator, denominator, expected, answer));

        // 300, 23 -> 13.(0434782608695652173913)
        numerator = 300;
        denominator = 23;
        expected = "13.(0434782608695652173913)";
        answer = solution.fractionToDecimal(numerator, denominator);
        System.out.println(String.format(format, numerator, denominator, expected, answer));

        // -1, -2147483648 -> 0.0000000004656612873077392578125
        numerator = -1;
        denominator = -2147483648;
        expected = "0.0000000004656612873077392578125";
        answer = solution.fractionToDecimal(numerator, denominator);
        System.out.println(String.format(format, numerator, denominator, expected, answer));

    }
}
