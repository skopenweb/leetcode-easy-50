/**
 * Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 *
 * Note that you must do this in-place without making a copy of the array.
 *
 * Input: nums = [0]
 * Output: [0]
 *
 * Constraints:
 *
 * 1 <= nums.length <= 104
 * -231 <= nums[i] <= 231 - 1
 */
class Solution8 {
    fun moveZeroes(nums: IntArray): Unit {
        var zeroIndex = 0
        while (zeroIndex < nums.size && nums[zeroIndex++] != 0);
        var i = zeroIndex--
        while (i < nums.size) {
            if (nums[i] != 0) {
                nums[zeroIndex++] = nums[i]
                nums[i] = 0
            }
            i++
        }
    }

    fun moveToZeros2(nums: IntArray) {
        var i = 0
        var j = 0 //zero
        while (i < nums.size) {
            if (nums[i] != 0) {
                nums[j++] = nums[i]
            }
            i++
        }

        while (j < nums.size) {
            nums[j++] = 0
        }
    }
}

fun main() {
    var arr = intArrayOf(0, 1, 0, 2, 4, 7, 0)
    Solution8().moveZeroes(arr)
    arr.print()
}
