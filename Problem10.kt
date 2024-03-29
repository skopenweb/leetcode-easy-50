/**
 * Determine if a 9 x 9 Sudoku board is valid. Only the filled cells need to be validated according to the following rules:
 *
 * Each row must contain the digits 1-9 without repetition.
 * Each column must contain the digits 1-9 without repetition.
 * Each of the nine 3 x 3 sub-boxes of the grid must contain the digits 1-9 without repetition.
 * Note:
 *
 * A Sudoku board (partially filled) could be valid but is not necessarily solvable.
 * Only the filled cells need to be validated according to the mentioned rules.
 *
 *
 * Input: board =
 * [["8","3",".",".","7",".",".",".","."]
 * ,["6",".",".","1","9","5",".",".","."]
 * ,[".","9","8",".",".",".",".","6","."]
 * ,["8",".",".",".","6",".",".",".","3"]
 * ,["4",".",".","8",".","3",".",".","1"]
 * ,["7",".",".",".","2",".",".",".","6"]
 * ,[".","6",".",".",".",".","2","8","."]
 * ,[".",".",".","4","1","9",".",".","5"]
 * ,[".",".",".",".","8",".",".","7","9"]]
 * Output: false
 * Explanation: Same as Example 1, except with the 5 in the top left corner being modified to 8. Since there are two 8's in the top left 3x3 sub-box, it is invalid.
 *
 * Constraints:
 *
 * board.length == 9
 * board[i].length == 9
 * board[i][j] is a digit 1-9 or '.'.
 */

class Solution10 {
    fun isValidSudoku(board: Array<CharArray>): Boolean {
        for (i in board.indices) {
            val marked = Array<Int>(board.size) { 0 }
            for (c in board[i]) {
                if (('1'..'9').contains(c)) {
                    marked[c - '1']++
                }
            }
            if (marked.any { it > 1 }) return false
        }

        for (i in board[0].indices) {
            val marked = Array<Int>(board.size) { 0 }
            for (j in board.indices) {
                if (('1'..'9').contains(board[j][i])) {
                    marked[board[j][i] - '1']++
                }
            }
            if (marked.any { it > 1 }) return false
        }
        for (i in board.indices step 3) {
            for (j in board[i].indices step 3) {
                val marked = Array(board.size) { 0 }

                for (k in 0..2) {
                    for (l in 0..2) {
                        if (board[i + k][j + l] in '0'..'9') {
                            marked[board[i + k][j + l] - '1']++
                        }
                    }
                }
                if (marked.any { it > 1 }) return false
            }
        }

        return true
    }
}

fun main() {
    val arr = arrayOf(
        charArrayOf('8', '3', '.', '.', '7', '.', '.', '.', '.'),
        charArrayOf('6', '.', '.', '1', '9', '5', '.', '.', '.'),
        charArrayOf('.', '9', '8', '.', '.', '.', '.', '6', '.'),
        charArrayOf('8', '.', '.', '.', '6', '.', '.', '.', '3'),
        charArrayOf('4', '.', '.', '8', '.', '3', '.', '.', '1'),
        charArrayOf('7', '.', '.', '.', '2', '.', '.', '.', '6'),
        charArrayOf('.', '6', '.', '.', '.', '.', '2', '8', '.'),
        charArrayOf('.', '.', '.', '4', '1', '9', '.', '.', '5'),
        charArrayOf('.', '.', '.', '.', '8', '.', '.', '7', '9')
    )

    println(Solution10().isValidSudoku(arr))
}
