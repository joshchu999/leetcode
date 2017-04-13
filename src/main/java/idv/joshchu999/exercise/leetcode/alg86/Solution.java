package idv.joshchu999.exercise.leetcode.alg86;

import java.util.*;

/**
 * Created by joshchu999 on 4/13/17.
 */
public class Solution {
    public ListNode partition(ListNode head, int x) {

        ListNode pivotI = null;
        ListNode pivotJ = head;

        if (head != null) {
            if (head.val < x) {
                pivotI = head;
            }

            while (pivotJ.next != null) {

                ListNode target = pivotJ.next;

                if (target.val < x) {
                    if (pivotI == null) {
                        pivotJ.next = target.next;
                        target.next = head;
                        head = target;
                    } else {
                        if (pivotI == pivotJ) {
                            pivotJ = target;
                        } else {
                            pivotJ.next = target.next;
                            target.next = pivotI.next;
                            pivotI.next = target;
                        }
                    }
                    pivotI = target;
                } else {
                    pivotJ = target;
                }
            }
        }

        return head;
    }
}
