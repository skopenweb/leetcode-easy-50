/**
 * You are given an integer array prices where prices[i] is the price of a given stock on the ith day.
 *
 * On each day, you may decide to buy and/or sell the stock. You can only hold at most one share of the stock at any time. However, you can buy it then immediately sell it on the same day.
 *
 * Find and return the maximum profit you can achieve.
 *
 * Input: prices = [1,2,3,4,5]
 * Output: 4
 * Explanation: Buy on day 1 (price = 1) and sell on day 5 (price = 5), profit = 5-1 = 4.
 * Total profit is 4.
 *
 * Constraints:
 *
 * 1 <= prices.length <= 3 * 104
 * 0 <= prices[i] <= 104
 */
class Solution {
    fun maxProfit(prices: IntArray): Int {
        if (prices.size < 2) return 0
        var profit = 0
        var i = 1
        var min = prices[0]
        var curr = prices[i]
        var state = if (curr > min) 1 else 0
        while (i < prices.size) {
            curr = prices[i]
            if (state == 1) {
                if (curr < prices[i - 1]) {
                    profit += prices[i - 1] - min
                    state = 0
                    min = curr
                }
            } else {
                if (curr == prices[i - 1]) {
                    // do nothing
                } else if (prices[i] < prices[i - 1]) {
                    min = curr
                } else {
                    state = 1
                }
            }
            i++
        }
        if (state == 1) profit += curr - min
        return profit
    }

    fun maxProfit2(prices: IntArray): Int {
        var prev = prices[0]
        var profit = 0
        prices.forEach { item ->
            val diff = item - prev
            if (diff > 0) profit += diff
            prev = item
        }
        return profit
    }

}

fun main() {
    println(Solution().maxProfit(intArrayOf(7, 1, 5, 3, 6, 4)))
    println(Solution().maxProfit(intArrayOf(1, 2, 3, 4, 5)))
    println(Solution().maxProfit(intArrayOf(7, 6, 4, 3, 1)))
}