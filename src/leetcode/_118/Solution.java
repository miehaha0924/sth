package leetcode._118;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a non-negative integer numRows, generate the first numRows of Pascal's triangle.
 * In Pascal's triangle, each number is the sum of the two numbers directly above it.
 *
 * Example:
 *
 * Input: 5
 * Output:
 * [
 * [1],
 * [1,1],
 * [1,2,1],
 * [1,3,3,1],
 * [1,4,6,4,1]
 * ]
 */
public class Solution {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> outList = new ArrayList<>();
        if (numRows == 0) {
            return outList;
        }
        List<Integer> inList0 = new ArrayList<>(1);
        inList0.add(1);
        outList.add(inList0);
        for (int i = 1; i < numRows; i++) {
            List<Integer> inList = new ArrayList<>(i + 1);
            inList.add(1);
            for (int j = 1; j < i; j++) {
                //不新建这个List而直接用inList.add(outList.get(i - 1).get(j - 1) + outList.get(i - 1).get(j))就会0ms通过
                List<Integer> lastInList = outList.get(i - 1);
                inList.add(lastInList.get(j - 1) + lastInList.get(j));
            }
            inList.add(1);
            outList.add(inList);
        }
        return outList;
    }

    public static void main(String[] args) {
        List<List<Integer>> outList = generate(0);
        String str = JSON.toJSONString(outList);
        System.out.println(str);
    }
}
