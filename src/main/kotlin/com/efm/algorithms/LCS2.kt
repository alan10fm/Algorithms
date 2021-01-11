import java.util.*
import kotlin.math.max


fun lcs2(a: IntArray, b: IntArray): Int {
    var rows = a.size + 1
    val columns = b.size + 1
    val matrixResults = Array(rows) { IntArray(columns) }

    for (row in 1 until rows) {
        for (column in 1 until columns) {
            val maximumPreviousValue =
                max(matrixResults[row - 1][column], matrixResults[row][column - 1])
            when {
                a[row - 1] == b[column - 1] -> matrixResults[row][column] =

                    matrixResults[row - 1][column - 1] + 1
                else -> matrixResults[row][column] = maximumPreviousValue
            }



        }
    }

    return matrixResults[rows - 1][columns - 1]
}

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()
    val a = IntArray(n)
    for (i in 0 until n) {
        a[i] = scanner.nextInt()
    }

    val m = scanner.nextInt()
    val b = IntArray(m)
    for (i in 0 until m) {
        b[i] = scanner.nextInt()
    }

    println(lcs2(a, b))
}
