/**
 * Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "leetcode"
 * Output: 0
 * Example 2:
 *
 * Input: s = "loveleetcode"
 * Output: 2
 * Example 3:
 *
 * Input: s = "aabb"
 * Output: -1
 *
 *
 * Constraints:
 *
 * 1 <= s.length <= 105
 * s consists of only lowercase English letters.
 */
class Solution13 {
    fun firstUniqChar(s: String): Int {
        val count = IntArray(26) { 0 }
        s.forEach { c ->
            val index = c - 'a'
            count[index]++
        }
        for (i in s.indices) {
            if (count[s[i]- 'a'] == 1) return i
        }
        return -1
    }
}

fun main() {
    println(Solution13().firstUniqChar("aabbb"))
}