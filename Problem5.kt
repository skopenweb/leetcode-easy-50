/**
 * Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
 *
 * You must implement a solution with a linear runtime complexity and use only constant extra space.
 *
 * Input: nums = [4,1,2,1,2]
 * Output: 4
 */
class Solution5 {
    fun singleNumber(nums: IntArray): Int {
        if (nums.isEmpty()) throw IllegalArgumentException()
        if (nums.size == 1) return nums[0]
        var ans = 0
        nums.forEach { ans = ans xor it }
        return ans
    }
}

fun main() {
    println(Solution5().singleNumber(intArrayOf(1, 2, 3, 2, 1)))
}