package idv.joshchu999.exercise.leetcode.alg395;

/**
 * Created by joshchu999 on 4/4/17.
 */
public class Main {
    public static void main(String[] args) {

        Solution solution = new Solution();

        String s = "";
        int k = 0;
        int expected = 0;
        int answer = 0;
        String format = "%s, %d -> %d (%d)";

        // "aaabb", 3 -> 3
        s = "aaabb";
        k = 3;
        expected = 3;
        answer = solution.longestSubstring(s, k);
        System.out.println(String.format(format, s, k, expected, answer));

        // "ababbc", 2 -> 5
        s = "ababbc";
        k = 2;
        expected = 5;
        answer = solution.longestSubstring(s, k);
        System.out.println(String.format(format, s, k, expected, answer));

        // "abacbbbbdeabababfgab", 2 -> 6
        s = "abacbbbbdeabababfgab";
        k = 2;
        expected = 6;
        answer = solution.longestSubstring(s, k);
        System.out.println(String.format(format, s, k, expected, answer));

        // "abacbbbdeaaaabaafgab", 2 -> 4
        s = "abacbbbdeaaaabaafgab";
        k = 2;
        expected = 4;
        answer = solution.longestSubstring(s, k);
        System.out.println(String.format(format, s, k, expected, answer));

    }
}
