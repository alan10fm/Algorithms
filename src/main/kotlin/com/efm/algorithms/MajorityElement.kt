import java.io.BufferedReader
import java.io.IOException
import java.io.InputStream
import java.io.InputStreamReader
import java.util.*

fun getMajorityElement(a: IntArray, left: Int, right: Int): Int {
    val number = getMajorityElementRec(a, left, right -1)
    var total = 0
    for (element in a) {
        if (element == number) {
            total++
            if (total > a.size / 2) {
                return number
            }
        }
    }
    return -1
}

fun getMajorityElementRec(a: IntArray, left: Int, right: Int): Int {
    if (left == right) {
        return a[left]
    }
    val half = (right - left) / 2 + left
    val majorNumber1 = getMajorityElementRec(a, left, half)
    val majorNumber2 = getMajorityElementRec(a, half + 1, right)

    if (majorNumber1 == majorNumber2) {
        return majorNumber1
    } else {
        val majorNumber1Count = countNumber(a, left, half, majorNumber1)
        val majorNumber2Count = countNumber(a, half + 1, right, majorNumber2)
        return if (majorNumber1Count > majorNumber2Count) return majorNumber1 else majorNumber2
    }
}

fun countNumber(a: IntArray, leftIndex: Int, rightIndex: Int, number: Int): Int {
    var total = 0
    for (i in leftIndex..rightIndex) {
        if (a[i] == number) {
            total++
        }
    }
    return total
}

fun main(args: Array<String>) {
    val scanner = FastScanner(System.`in`)
    val n = scanner.nextInt()
    val a = IntArray(n)
    for (i in 0 until n) {
        a[i] = scanner.nextInt()
    }
    if (getMajorityElement(a, 0, a.size) != -1) {
        println(1)
    } else {
        println(0)
    }
}

class FastScanner(stream: InputStream) {
    var br: BufferedReader = BufferedReader(InputStreamReader(stream))
    var st: StringTokenizer? = null

    fun next(): String {
        while (st == null || !st!!.hasMoreTokens()) {
            try {
                st = StringTokenizer(br.readLine())
            } catch (e: IOException) {
                e.printStackTrace()
            }
        }
        return st!!.nextToken()
    }

    fun nextInt() = next().toInt()
}
