package idv.joshchu999.exercise.leetcode.alg187;

import java.util.*;

/**
 * Created by joshchu999 on 4/4/17.
 */
public class Solution {

    public List<String> findRepeatedDnaSequences(String s) {

        Map<String, Integer> counts = new HashMap<String, Integer>();
        List<String> result = new ArrayList<String>();

        for (int i = 0 ; i < s.length() - 10 + 1 ; i++) {
            String sub = s.substring(i, i + 10);
            if (!counts.containsKey(sub)) {
                counts.put(sub, 0);
            }
            counts.replace(sub, counts.get(sub) + 1);
        }

        Iterator it = counts.keySet().iterator();

        while (it.hasNext()) {
            String sub = (String) it.next();
            int subCount = (int) counts.get(sub);
            if (subCount > 1) {
                result.add(sub);
            }
        }

        return result;
    }
}
