/**
 * Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must appear as many times as it shows in both arrays and you may return the result in any order.
 *
 *Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 * Output: [4,9]
 * Explanation: [9,4] is also accepted.
 *
 * Constraints:
 *
 * 1 <= nums1.length, nums2.length <= 1000
 * 0 <= nums1[i], nums2[i] <= 1000
 */
class Solution6 {
    fun intersect(nums1: IntArray, nums2: IntArray): IntArray {
        val res = mutableListOf<Int>()

        nums1.forEach {
            nums2.forEachIndexed { index, item ->
                if (item == it && it != -1) {
                    res.add(it)
                    nums2[index] = -1
                    return@forEach
                }
            }
        }
        return IntArray(res.size) { res[it] }
    }
}

fun main() {
    val arr = Solution6().intersect(intArrayOf(4,9,5), intArrayOf(9,4,9,8,4))
    arr.print()
}