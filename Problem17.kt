/**
 * Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
 *
 *
 *
 * Example 1:
 *
 * Input: haystack = "sadbutsad", needle = "sad"
 * Output: 0
 * Explanation: "sad" occurs at index 0 and 6.
 * The first occurrence is at index 0, so we return 0.
 * Example 2:
 *
 * Input: haystack = "leetcode", needle = "leeto"
 * Output: -1
 * Explanation: "leeto" did not occur in "leetcode", so we return -1.
 *
 *
 * Constraints:
 *
 * 1 <= haystack.length, needle.length <= 104
 * haystack and needle consist of only lowercase English characters.
 */
class Solution17 {
    fun strStr(haystack: String, needle: String): Int {
        for (i in 0 ..(haystack.length - needle.length)) {
            var j = 0
            while (j < needle.length) {
                if (haystack[i+j] != needle[j]) break
                j++
            }
            if (j == needle.length) return i
        }
        return -1
    }

    fun isEquals(a: String, b: String, i: Int, j: Int): Boolean {
        var k = 0
        while (k < b.length) {
            if (a[i + k] == b[j + k]) k++
            else break;
        }

        return k == b.length
    }
}

fun main() {
    println(Solution17().strStr("asad", "sad"))
}