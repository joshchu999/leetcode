package idv.joshchu999.leetcode.alg278;

/**
 * Created by joshchu999 on 4/4/17.
 */
public class Main {
    public static void main(String[] args) {

        int n = 50;
        int first = 0;
        int answer = 0;
        String format = "%d, %d (%d)";

        for (first = 1 ; first <= n ; first++) {
            answer = (new Solution(first)).firstBadVersion(n);
            System.out.println(String.format(format, n, first, answer));
        }


        n = 2126753390;
        first = 1702766719;
        answer = (new Solution(first)).firstBadVersion(n);
        System.out.println(String.format(format, n, first, answer));
    }
}
