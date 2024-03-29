/**
 * Write a function that reverses a string. The input string is given as an array of characters s.
 *
 * You must do this by modifying the input array in-place with O(1) extra memory.
 *
 *
 *
 * Example 1:
 *
 * Input: s = ["h","e","l","l","o"]
 * Output: ["o","l","l","e","h"]
 *
 * * Example 2:
 *
 * Input: s = ["H","a","n","n","a","h"]
 * Output: ["h","a","n","n","a","H"]
 *
 * Constraints:
 *
 * 1 <= s.length <= 105
 * s[i] is a printable ascii character.
 */
class Solution11 {
    fun reverseString(s: CharArray): Unit {
        for (i in 0 until (s.size / 2)) {
            val t = s[i]
            s[i] = s[s.size - 1 - i]
            s[s.size - 1 - i] = t
        }
    }
}