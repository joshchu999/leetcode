package idv.joshchu999.exercise.leetcode.alg278;

/**
 * Created by joshchu999 on 4/4/17.
 */
public class VersionControl {

    protected int first = 0;

    public VersionControl(int first) {
        this.first = first;
    }

    protected boolean isBadVersion(int version) {
        return version >= first;
    }
}
