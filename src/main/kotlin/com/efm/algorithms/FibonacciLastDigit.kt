import java.util.*

fun getFibonacciLastDigitNaive(n: Int): Int {
    val fibList = LongArray(n + 1)
    if (n <= 1) {
        return n
    }
    fibList[0] = 0
    fibList[1] = 1
    for (i in 2..n) {
        fibList[i] = (fibList[i - 1] % 10 + fibList[i - 2 % 10])
    }
    return (fibList.last() % 10).toInt()
}

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()
    val c = getFibonacciLastDigitNaive(n)
    println(c)
}
