/**
 * Remove Duplicates from Sorted Array
 *
 * Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same. Then return the number of unique elements in nums.
 *
 * Consider the number of unique elements of nums to be k, to get accepted, you need to do the following things:
 *
 * Change the array nums such that the first k elements of nums contain the unique elements in the order they were present in nums initially. The remaining elements of nums are not important as well as the size of nums.
 * Return k.
 *
 * Input: nums = [0,0,1,1,1,2,2,3,3,4]
 * Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
 * Explanation: Your function should return k = 5, with the first five elements of nums being 0, 1, 2, 3, and 4 respectively.
 * It does not matter what you leave beyond the returned k (hence they are underscores).
 *
 * Constraints:
 *
 * 1 <= nums.length <= 3 * 104
 * -100 <= nums[i] <= 100
 * nums is sorted in non-decreasing order.
 */
class Solution {
    fun removeDuplicates(nums: IntArray): Int {
        if (nums.isEmpty()) return 0
        var i = 1
        while (i < nums.size && nums[i] != nums[i - 1]) i++
        var j = i + 1
        while (j < nums.size) {
            if (nums[j] != nums[j - 1]) {
                nums[i++] = nums[j]
            }
            j++
        }
        return i
    }
}

fun main() {
    val i = Solution().removeDuplicates(intArrayOf(0, 0, 1, 1, 1, 2, 2, 3, 3, 4))
    println(i)
    
    val j = Solution().removeDuplicates(intArrayOf(0, 1, 2, 3, 4))
    println(j)
}