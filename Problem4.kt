/**
 * Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
 *
 * Input: nums = [-1,-100,3,99], k = 2
 * Output: [3,99,-1,-100]
 * Explanation:
 *   rotate 1 steps to the right: [99,-1,-100,3]
 *   rotate 2 steps to the right: [3,99,-1,-100]
 */
class Solution4 {
    fun containsDuplicate(nums: IntArray): Boolean {
        val set = hashSetOf<Int>()
        for (item in nums) {
            if (item in set) {return false}
            set.add(item)
        }
        return true
    }
}

fun main() {
    val arr = intArrayOf(1,2,3,1)
    val arr2 = IntArray(5) { it + 1 }
    println(Solution4().containsDuplicate(arr))
    println(Solution4().containsDuplicate(arr2))
}
