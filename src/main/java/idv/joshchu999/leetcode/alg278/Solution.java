package idv.joshchu999.leetcode.alg278;

/**
 * Created by joshchu999 on 4/4/17.
 */
public class Solution extends VersionControl {

    public Solution(int first) {
        super(first);
    }

    public int firstBadVersion(int n) {

        int start = 1;
        int end = n;

        while (start != end) {

            int mid = (int) (((((long) start)  + ((long) end))) / 2);

            if (this.isBadVersion(mid)) {
                end = mid;
            }
            else {
                start = mid + 1;
            }
        }

        return start;
    }
}
