package leetcode._728;

import java.util.ArrayList;
import java.util.List;

/**
 * A self-dividing number is a number that is divisible by every digit it contains.
 *
 * For example, 128 is a self-dividing number because 128 % 1 == 0, 128 % 2 == 0, and 128 % 8 == 0.
 *
 * Also, a self-dividing number is not allowed to contain the digit zero.
 *
 * Given a lower and upper number bound, output a list of every possible self dividing number, including the bounds
 * if possible.
 *
 * Example 1:
 * Input:
 * left = 1, right = 22
 * Output: [1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22]
 * Note:
 *
 * The boundaries of each input argument are 1 <= left <= right <= 10000.
 */
public class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            int len = String.valueOf(i).length();
            int ge = i % 10;
            int shi = i / 10 == 0 ? 0 : i / 10 % 10;
            int bai = i / 100 == 0 ? 0 : i / 100 % 10;
            int qian = i / 1000 == 0 ? 0 : i / 1000 % 10;

            if (len == 4 && qian != 0 && bai != 0 && shi != 0 && ge != 0) {
                if (i % ge == 0 && i % shi == 0 && i % bai == 0 && i % qian == 0) {
                    list.add(i);
                }
            } else if (len == 3 && bai != 0 && shi != 0 && ge != 0) {
                if (i % ge == 0 && i % shi == 0 && i % bai == 0) {
                    list.add(i);
                }
            } else if (len == 2 && shi != 0 && ge != 0) {
                if (i % ge == 0 && i % shi == 0) {
                    list.add(i);
                }
            } else if (len == 1 && ge != 0) {
                if (i % ge == 0) {
                    list.add(i);
                }
            }
        }
        return list;
    }

}
