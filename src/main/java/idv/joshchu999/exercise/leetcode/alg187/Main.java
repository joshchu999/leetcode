package idv.joshchu999.exercise.leetcode.alg187;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by joshchu999 on 4/4/17.
 */
public class Main {
    public static void main(String[] args) {

        Solution solution = new Solution();

        String s = null;
        List<String> expected = null;
        List<String> answer = null;
        String format = "%s -> %s, %s";

        // AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT -> ["AAAAACCCCC", "CCCCCAAAAA"]
        s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT";
        expected = new ArrayList<String>();
        expected.add("AAAAACCCCC");
        expected.add("CCCCCAAAAA");
        answer = solution.findRepeatedDnaSequences(s);
        System.out.println(String.format(format, s, Arrays.toString(expected.toArray()), Arrays.toString(answer.toArray())));

        // AAAAAAAAAAA -> ["AAAAAAAAAA"]
        s = "AAAAAAAAAAA";
        expected = new ArrayList<String>();
        expected.add("AAAAAAAAAA");
        answer = solution.findRepeatedDnaSequences(s);
        System.out.println(String.format(format, s, Arrays.toString(expected.toArray()), Arrays.toString(answer.toArray())));
    }
}
