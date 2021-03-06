package leetcode._171;


/**
 * 给定一个Excel表格中的列名称，返回其相应的列序号。
 * 例如
 * A -> 1
 * B -> 2
 * C -> 3
 * ...
 * Z -> 26
 * AA -> 27
 * AB -> 28
 * ...
 * 示例 1:
 * 输入: "A"
 * 输出: 1
 * <p>
 * 示例 2:
 * 输入: "AB"
 * 输出: 28
 * <p>
 * 示例 3:
 * 输入: "ZY"
 * 输出: 701
 */
public class Solution {
    public static int titleToNumber(String s) {
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            char temp = s.charAt(i);
            res += Math.pow(26, (s.length() - i - 1)) * (temp - 64);
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(titleToNumber("B"));
    }
}
