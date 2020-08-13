import java.util.*

fun lcmNaive(a: Int, b: Int): Long {
    return a.toLong() * b.toLong() / gcd(a.toLong(), b.toLong())
}

fun gcd(a: Long, b: Long): Long {
    if (b == 0L) {
        return a
    }
    val max = if (a >= b) a else b
    val min = if (a >= b) b else a

    val newA = min
    val newB = max % min
    return gcd(newA, newB)
}

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val a = scanner.nextInt()
    val b = scanner.nextInt()

    println(lcmNaive(a, b))
}
