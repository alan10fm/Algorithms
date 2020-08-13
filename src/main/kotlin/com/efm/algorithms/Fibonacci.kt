import java.util.*

fun calcFib(n: Long): Long {
    val fibList = mutableListOf<Long>()
    if (n <= 1) {
        return n
    }
    fibList.add(0, 0)
    fibList.add(1, 1)
    for (i in 2..n) {
        fibList.add(i.toInt(), (fibList[i.toInt() - 1] + fibList[i.toInt() - 2]))
    }
    return fibList.last()
}

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextLong()

    println(calcFib(n))
}
