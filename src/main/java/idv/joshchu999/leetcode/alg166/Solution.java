package idv.joshchu999.leetcode.alg166;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by joshchu999 on 4/4/17.
 */
public class Solution {
    public String fractionToDecimal(int numerator, int denominator) {

        long numeratorL = (long) numerator;
        long denominatorL = (long) denominator;


        String result = "";

        if ((numeratorL < 0) && (denominatorL < 0)) {
            numeratorL *= -1;
            denominatorL *= -1;
        }
        else if ((numeratorL < 0) && (denominatorL > 0)) {
            numeratorL *= -1;
            result = "-";
        }
        else if ((numeratorL > 0) && (denominatorL < 0)) {
            denominatorL *= -1;
            result = "-";
        }
        else {
            ;
        }

        Map<Long, Long> location = new HashMap<Long, Long>();

        result += String.valueOf(numeratorL / denominatorL);

        long remainderL = numeratorL % denominatorL;

        if (remainderL != 0) {

            result += ".";

            for (long i = 1 ; i < denominatorL ; i++) {

                location.put(remainderL, i);

                numeratorL = remainderL * 10;

                result += String.valueOf(numeratorL / denominatorL);

                remainderL = numeratorL % denominatorL;

                if (remainderL == 0) {
                    break;
                }
                else {
                    Long index = location.get(remainderL);

                    if (null != index) {

                        String replace = result.substring(result.indexOf('.') + index.intValue());
                        result = result.replace(replace, "(" + replace + ")");
                        break;
                    }
                }
            }
        }

        return result;
    }
}
