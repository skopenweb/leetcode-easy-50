/**
 * You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.
 *
 * Increment the large integer by one and return the resulting array of digits.
 *
 *Input: digits = [4,3,2,1]
 * Output: [4,3,2,2]
 * Explanation: The array represents the integer 4321.
 * Incrementing by one gives 4321 + 1 = 4322.
 * Thus, the result should be [4,3,2,2].
 */
class Solution {
    fun plusOne(digits: IntArray): IntArray {
        var carry = 1
        for (i in digits.size - 1 downTo 0) {
            val sum = digits[i] + carry
            if (sum > 9) {
                digits[i] = sum - 10
                carry = 1
            } else {
                digits[i] = sum
                carry = 0
            }
        }
        return if (carry == 1) {
            IntArray(digits.size + 1) { if (it == 0) 1 else digits[it - 1] }
        } else digits
    }
}

fun main() {
    val ans = Solution().plusOne(intArrayOf(1,2,3))
    ans.print()
}