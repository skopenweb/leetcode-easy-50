/**
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 *
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 * You can return the answer in any order.
 *
 * Input: nums = [3,2,4], target = 6
 * Output: [1,2]
 * Constraints:
 *
 * 2 <= nums.length <= 104
 * -109 <= nums[i] <= 109
 * -109 <= target <= 109
 * Only one valid answer exists.
 *
 */

class Solution9 {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = mutableMapOf<Int, Int>()
        nums.forEachIndexed { index, item ->
            val value = map[target - item]
            if (value == null) {
                map[item] = index
            } else {
                return intArrayOf(value, index)
            }
        }
        return intArrayOf()
    }
}

fun main() {
    Solution9().twoSum(intArrayOf(2, 7, 11, 15), 9).print()
    Solution9().twoSum(intArrayOf(2, 3, 4), 6).print()
}