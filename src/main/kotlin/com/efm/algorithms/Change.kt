import java.util.*

private val coins = listOf(10, 5, 1)

fun getChange(m: Int): Int {
    var amount = m
    var counter = 0

    coins.forEach { coin ->
        if (amount >= coin) {
            counter += (amount / coin)
            amount %= coin
        }
    }

    return counter
}

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val m = scanner.nextInt()
    println(getChange(m))
}
