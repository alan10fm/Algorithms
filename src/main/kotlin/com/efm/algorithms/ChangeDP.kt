import java.util.*

fun getChange(m: Int): Int {
    val coins = intArrayOf(1, 3, 4)
    val changeArray = Array(m + 1) { m + 2 }

    for (i in changeArray.indices) {
        if (i == 0) {
            changeArray[0] = 0
            continue
        }
        for (coin in coins) {
            if (coin > i) {
                continue
            } else {
                val remainingCoins = i - coin
                val totalCoins = changeArray[remainingCoins] + 1
                if (totalCoins < changeArray[i]) {
                    changeArray[i] = totalCoins
                }
            }
        }
    }

    return changeArray.last()
}

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val m = scanner.nextInt()
    println(getChange(m))
}
