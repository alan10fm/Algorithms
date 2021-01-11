import java.util.*
import kotlin.math.min

fun getEditDistance(s: String, t: String): Int {

    val rows = s.length + 1
    val columns = t.length + 1
    val rowsList = mutableListOf<IntArray>()

    for (row in 0 until rows) {
        rowsList.add(IntArray(columns))
    }
    val editDistanceMatrix = arrayOf(*rowsList.toTypedArray())

    for (column in 0 until columns) {
        if (column == 0) {
            editDistanceMatrix[0][0] = 0
        } else {
            editDistanceMatrix[0][column] = column
        }
    }

    for (row in 0 until rows) {
        if (row == 0) {
            editDistanceMatrix[0][0] = 0
        } else {
            editDistanceMatrix[row][0] = row
        }
    }

    for (row in 1 until rows) {
        for (column in 1 until columns) {
            val replace = editDistanceMatrix[row - 1][column - 1]
            val delete = editDistanceMatrix[row][column - 1]
            val insert = editDistanceMatrix[row - 1][column]
            val minimumValue = min(replace, min(delete, insert))

            if (column > t.length || row > s.length) {
                editDistanceMatrix[row][column] = minimumValue + 1
            } else if (t[column - 1] == s[row - 1]) {
                editDistanceMatrix[row][column] = editDistanceMatrix[row - 1][column - 1]
            } else {
                editDistanceMatrix[row][column] = minimumValue + 1
            }

        }
    }


    return editDistanceMatrix[rows - 1][columns - 1]
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val s = scan.next()
    val t = scan.next()

    println(getEditDistance(s, t))
}
