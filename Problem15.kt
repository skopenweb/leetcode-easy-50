/**
 * A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.
 *
 * Given a string s, return true if it is a palindrome, or false otherwise.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "A man, a plan, a canal: Panama"
 * Output: true
 * Explanation: "amanaplanacanalpanama" is a palindrome.
 * Example 2:
 *
 * Input: s = "race a car"
 * Output: false
 * Explanation: "raceacar" is not a palindrome.
 * Example 3:
 *
 * Input: s = " "
 * Output: true
 * Explanation: s is an empty string "" after removing non-alphanumeric characters.
 * Since an empty string reads the same forward and backward, it is a palindrome.
 *
 *
 * Constraints:
 *
 * 1 <= s.length <= 2 * 105
 * s consists only of printable ASCII characters.
 */
class Solution15 {
    fun isPalindrome(s: String): Boolean {
        var i = 0
        var j = s.length - 1
        while (i < j) {
            while (i < j && !s[i].isAlphaNumeric()) i++
            while (i < j && !s[j].isAlphaNumeric()) j--
            if (i < j && s[i].equals(s[j], ignoreCase = true).not()) {
                return false
            }
            i++
            j--
        }
        return true
    }
}

fun Char.isAlphaNumeric(): Boolean {
    return (this in 'a'..'z') || (this in 'A'..'Z') || (this in '0'..'9')
}

fun main() {
    println(Solution15().isPalindrome("A man, a plan, a canal: Panama"))
}