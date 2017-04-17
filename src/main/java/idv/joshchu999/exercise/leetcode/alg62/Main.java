package idv.joshchu999.exercise.leetcode.alg62;

/**
 * Created by joshchu999 on 4/4/17.
 */
public class Main {
    public static void main(String[] args) {

        Solution solution = new Solution();

        int m = 1;
        int n = 1;
        int expected = 0;
        int answer = 0;
        String format = "%d, %d -> %d (%d)";

        // 1, 1 -> 1
        m = 1;
        n = 1;
        expected = 1;
        answer = solution.uniquePaths(m, n);
        System.out.println(String.format(format, m, n, expected, answer));

        // 5, 1 -> 1
        m = 5;
        n = 1;
        expected = 1;
        answer = solution.uniquePaths(m, n);
        System.out.println(String.format(format, m, n, expected, answer));

        // 1, 8 -> 1
        m = 1;
        n = 8;
        expected = 1;
        answer = solution.uniquePaths(m, n);
        System.out.println(String.format(format, m, n, expected, answer));

        // 2, 2 -> 2
        m = 2;
        n = 2;
        expected = 2;
        answer = solution.uniquePaths(m, n);
        System.out.println(String.format(format, m, n, expected, answer));

        // 3, 2 -> 3
        m = 3;
        n = 2;
        expected = 3;
        answer = solution.uniquePaths(m, n);
        System.out.println(String.format(format, m, n, expected, answer));

        // 3, 3 -> 6
        m = 3;
        n = 3;
        expected = 6;
        answer = solution.uniquePaths(m, n);
        System.out.println(String.format(format, m, n, expected, answer));
    }
}
