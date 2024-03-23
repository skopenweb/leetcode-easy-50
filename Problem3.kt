/**
 * Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
 *
 * Input: nums = [-1,-100,3,99], k = 2
 * Output: [3,99,-1,-100]
 * Explanation:
 *   rotate 1 steps to the right: [99,-1,-100,3]
 *   rotate 2 steps to the right: [3,99,-1,-100]
 */
class Solution3 {
    fun rotate(nums: IntArray, k: Int): Unit {
        // input = [2, 4, 6, 8, 10, 12], k = 2
        // output = [6, 8, 10, 12, 2, 4]
        var j = 0
        val N = nums.size
        var count = 0
        val k1 = k%N
        while (count < N) {
            var i = j
            val temp = nums[i]
            while (true) {
                count++
                val next = (i - k1 + N) % N
                if (next == j) {
                    nums[i] = temp
                    break
                } else {
                    nums[i] = nums[next]
                    i = next
                }
            }
            j++
        }
    }
}

fun main() {
    var arr = intArrayOf(2, 4, 6, 8, 10)
    var arr2 = IntArray(7) { it+1 }
//    Solution3().rotate(arr, 2)
    // arr.print()

    Solution3().rotate(intArrayOf(1, 3), 3)
    arr2.print()
}

