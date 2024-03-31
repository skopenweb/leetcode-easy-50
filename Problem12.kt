/**
 * Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
 *
 * Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
 *
 * Input: x = -123
 * Output: -321
 * Example 3:
 *
 * Constraints:
 *
 * -2^31 <= x <= 2^31 - 1
 */
class Solution12 {
    fun reverse(x: Int): Int {
        val signed = if (x < 0) -1 else 1
        var x1 = x * signed
        var y = 0
        while (x1 > 0) {
            val x2 = x1 / 10
            if (y > Int.MAX_VALUE / 10) return 0
            y = y * 10 + (x1 - x2 * 10)
            x1 = x2
        }
        return y * signed
    }
}

fun main() {
    println(Solution12().reverse(-123))
}