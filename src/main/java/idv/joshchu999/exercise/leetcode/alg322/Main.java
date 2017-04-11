package idv.joshchu999.exercise.leetcode.alg322;

/**
 * Created by joshchu999 on 4/4/17.
 */
public class Main {
    public static void main(String[] args) {

        Solution solution = new Solution();

        int[] coins = null;
        int amount = 0;
        int expected = 0;
        int answer = 0;
        String format = "%s, %d -> %d (%d)";

        // [1, 2, 5], 11 -> 3
        coins = new int[]{1, 2, 5};
        amount = 11;
        expected = 3;
        answer = solution.coinChange(coins, amount);
        System.out.println(String.format(format, coins, amount, expected, answer));

        // [2], 3 -> -1
        coins = new int[]{2};
        amount = 3;
        expected = -1;
        answer = solution.coinChange(coins, amount);
        System.out.println(String.format(format, coins, amount, expected, answer));

        // [1, 2, 5], 21 -> 5
        coins = new int[]{1, 2, 5};
        amount = 21;
        expected = 5;
        answer = solution.coinChange(coins, amount);
        System.out.println(String.format(format, coins, amount, expected, answer));

        // [2, 7, 8, 10], 29 -> 4
        coins = new int[]{2, 7, 8, 10};
        amount = 29;
        expected = 4;
        answer = solution.coinChange(coins, amount);
        System.out.println(String.format(format, coins, amount, expected, answer));

        // [2, 5, 10, 1], 27 -> 4
        coins = new int[]{2, 5, 10, 1};
        amount = 27;
        expected = 4;
        answer = solution.coinChange(coins, amount);
        System.out.println(String.format(format, coins, amount, expected, answer));

        // [186, 419, 83, 408], 6249 -> 20
        coins = new int[]{186, 419, 83, 408};
        amount = 6249;
        expected = 20;
        answer = solution.coinChange(coins, amount);
        System.out.println(String.format(format, coins, amount, expected, answer));




    }
}
