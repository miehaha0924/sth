package leetcode._121;

/**
 * Say you have an array for which the ith element is the price of a given stock on day i.
 *
 * If you were only permitted to complete at most one transaction (i.e., buy one and sell one share of the stock),
 * design an algorithm to find the maximum profit.
 *
 * Note that you cannot sell a stock before you buy one.
 *
 * Example 1:
 *
 * Input: [7,1,5,3,6,4]
 * Output: 5
 * Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
 * Not 7-1 = 6, as selling price needs to be larger than buying price.
 * Example 2:
 *
 * Input: [7,6,4,3,1]
 * Output: 0
 * Explanation: In this case, no transaction is done, i.e. max profit = 0.
 */
public class Solution {
    public static int maxProfit(int[] prices) {
        /*int max = 0;
        int len = prices.length;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if ((prices[j] - prices[i]) > max) {
                    max = prices[j] - prices[i];
                }
            }
        }
        return max;*/

        if (prices.length == 0) {
            return 0;
        }
        int max = 0;
        int min = prices[0];
        for (int price : prices) {
            if (price < min) {
                min = price;
            } else {
                max = max > (price - min) ? max : (price - min);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        //int[] prices = {7, 6,4,3,1};
        System.out.println(maxProfit(prices));
    }
}
