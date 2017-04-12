package idv.joshchu999.exercise.leetcode.alg395;

import java.util.*;

/**
 * Created by joshchu999 on 4/4/17.
 */
public class Solution {
    public int longestSubstring(String s, int k) {

        int result = 0;

        if (s.length() >= k) {

            Map<Character, List<Integer>> list = new HashMap<Character, List<Integer>>();

            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);

                List<Integer> tempList = null;

                if (!list.containsKey(c)) {
                    tempList = new ArrayList<Integer>();
                    list.put(c, tempList);
                } else {
                    tempList = list.get(c);
                }

                tempList.add(i);
            }

            List<Integer> indexes = new ArrayList<Integer>();

            for (List<Integer> tempList : list.values()) {
                if (tempList.size() < k) {
                    indexes.addAll(tempList);
                }
            }

            if (indexes.size() == 0) {
                result = s.length();
            }
            else {

                Collections.sort(indexes);

                int lastIndex = 0;

                for (int i : indexes) {

                    if (lastIndex == i) {
                        lastIndex++;
                    } else {
                        int tempResult = longestSubstring(s.substring(lastIndex, i), k);
                        if (tempResult > result) {
                            result = tempResult;
                        }
                        lastIndex = i + 1;
                    }
                }

                if (lastIndex < s.length()) {
                    int tempResult = longestSubstring(s.substring(lastIndex, s.length()), k);
                    if (tempResult > result) {
                        result = tempResult;
                    }
                }
            }
        }

        return result;
    }
}
