package idv.joshchu999.exercise.leetcode.alg815;

/**
 * Created by joshchu999 on 4/4/17.
 */
public class Main {
    public static void main(String[] args) {

        Solution solution = new Solution();

        int[][] routes = null;
        int S = 0;
        int T = 0;
        int expected = 0;
        int answer = 0;
        String format = "%d, %d";

        // [[1, 2, 7],[3, 6, 7]]
        routes = new int[][]{
                {1, 2, 7},
                {3, 6, 7}
        };
        S = 1;
        T = 6;
        expected = 2;
        answer = solution.numBusesToDestination(routes, S, T);
        System.out.println(String.format(format, expected, answer));
    }
}
