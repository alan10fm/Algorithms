import java.util.*

fun gcdNaive(a: Int, b: Int): Int {
    if (b == 0) {
        return a
    }
    val max = if (a >= b) a else b
    val min = if (a >= b) b else a

    val newA = min
    val newB = max % min
    return gcdNaive(newA, newB)
}

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val a = scanner.nextInt()
    val b = scanner.nextInt()

    println(gcdNaive(a, b))
}
