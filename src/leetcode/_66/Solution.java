package leetcode._66;

import java.math.BigDecimal;

/**
 * Given a non-empty array of digits representing a non-negative integer, plus one to the integer.
 * <p>
 * The digits are stored such that the most significant digit is at the head of the list, and each element in the
 * array contain a single digit.
 * <p>
 * You may assume the integer does not contain any leading zero, except the number 0 itself.
 * <p>
 * Example 1:
 * Input: [1,2,3]
 * Output: [1,2,4]
 * Explanation: The array represents the integer 123.
 * <p>
 * Example 2:
 * Input: [4,3,2,1]
 * Output: [4,3,2,2]
 * Explanation: The array represents the integer 4321.
 */
public class Solution {
    public static int[] plusOne(int[] digits) {
       /* //方法一
        BigDecimal bd = new BigDecimal(0);
        for (int i = 0; i < digits.length; i++) {
            bd = bd.add(BigDecimal.valueOf(10).pow(digits.length - i - 1).multiply(BigDecimal.valueOf(digits[i])));
        }
        bd = bd.add(BigDecimal.valueOf(1));
        String s = String.valueOf(bd);
        int[] res = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            res[i] = s.charAt(i) - 48;
        }
        return res;*/


        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] res = new int[digits.length + 1];
        res[0] = 1;
        return res;
    }

    public static void main(String[] args) {
        int[] test = {7, 2, 8, 5, 0, 9, 1, 2, 9, 5, 3, 6, 6, 7, 3, 2, 8, 4, 3, 7, 9, 5, 7, 7, 4, 7, 4, 9, 4, 7, 0, 1,
                1, 1, 7, 4, 0, 0, 6};
        int[] re = plusOne(test);
        for (int i : re) {
            System.out.print(i + " ");
        }
    }
}
