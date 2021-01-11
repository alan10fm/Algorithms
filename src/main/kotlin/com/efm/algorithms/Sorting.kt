import java.io.BufferedReader
import java.io.IOException
import java.io.InputStream
import java.io.InputStreamReader
import java.util.*

private val random = Random()

fun partition3(a: IntArray, l: Int, r: Int): IntArray {
    var newIndexLeft = l
    var newIndexRight = l
    var pivotIndex = l

    for (index in l..r) {
        if (index == pivotIndex || pivotIndex >= a.size - 1) {
            continue
        } else {
            if (a[pivotIndex] == a[index]) {
                newIndexRight++
                val tempValue = a[newIndexRight]
                a[newIndexRight] = a[index]
                a[index] = tempValue
            }
            if (a[pivotIndex] > a[index]) {
                val tempValue = a[index]
                for (i in index downTo newIndexRight + 1) {
                    a[i] = a[i - 1]
                }
                a[newIndexLeft] = tempValue
                newIndexLeft++
                newIndexRight++
                pivotIndex++
            }
        }
    }


    return intArrayOf(newIndexLeft, newIndexRight)
}

fun randomizedQuickSort(a: IntArray, l: Int, r: Int) {
    if (l >= r) {
        return
    }
    val indices = partition3(a, l, r)
    randomizedQuickSort(a, l, indices[0])
    randomizedQuickSort(a, indices[1] + 1, r)
}

fun main(args: Array<String>) {
    val scanner = FastScanner(System.`in`)
    val n = scanner.nextInt()
    val a = IntArray(n)
    for (i in 0 until n) {
        a[i] = scanner.nextInt()
    }
    randomizedQuickSort(a, 0, n - 1)
    for (i in 0 until n) {
        print(a[i].toString() + " ")
    }
}
//
//class FastScanner(stream: InputStream) {
//    var br: BufferedReader = BufferedReader(InputStreamReader(stream))
//    var st: StringTokenizer? = null
//
//    fun next(): String {
//        while (st == null || !st!!.hasMoreTokens()) {
//            try {
//                st = StringTokenizer(br.readLine())
//            } catch (e: IOException) {
//                e.printStackTrace()
//            }
//        }
//        return st!!.nextToken()
//    }
//
//    fun nextInt() = next().toInt()
//}
