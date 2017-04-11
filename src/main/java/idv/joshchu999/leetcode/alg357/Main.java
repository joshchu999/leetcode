package idv.joshchu999.leetcode.alg357;

/**
 * Created by joshchu999 on 4/4/17.
 */
public class Main {
    public static void main(String[] args) {

        Solution solution = new Solution();

        int n = 0;
        int expected = 0;
        int answer = 0;
        String format = "%d -> %d (%d)";

        // 1 -> 10
        n = 1;
        expected = 10;
        answer = solution.countNumbersWithUniqueDigits(n);
        System.out.println(String.format(format, n, expected, answer));

        // 2 -> 91
        n = 2;
        expected = 92;
        answer = solution.countNumbersWithUniqueDigits(n);
        System.out.println(String.format(format, n, expected, answer));

        // 3 -> 739
        n = 3;
        expected = 739;
        answer = solution.countNumbersWithUniqueDigits(n);
        System.out.println(String.format(format, n, expected, answer));

        for (int i = 1 ; i <= 9 ; i++) {
            expected = 0;
            answer = solution.countNumbersWithUniqueDigits(i);
            System.out.println(String.format(format, i, expected, answer));
        }

    }
}
