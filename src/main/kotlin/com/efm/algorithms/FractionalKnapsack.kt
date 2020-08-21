import java.math.RoundingMode
import java.util.*

fun getOptimalValue(capacity: Int, values: IntArray, weights: IntArray): Double {
    var w = capacity
    var totalValue = 0.0
    val mapOfWeights = mutableMapOf<Int, Double>()
    for (i in values.indices) {
        mapOfWeights[i] = values[i].toDouble() / weights[i].toDouble()
    }

    val orderedListIndex = mapOfWeights.toList().sortedByDescending { (_, value) -> value }

    orderedListIndex.forEach { element ->
        if (weights[element.first] <= w) {
            totalValue += weights[element.first] * element.second
            w -= (weights[element.first])
        } else {
            totalValue += w * element.second
            w = 0
        }
    }

    return totalValue.toBigDecimal().setScale(4, RoundingMode.UP).toDouble()
}

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()
    val capacity = scanner.nextInt()
    val values = IntArray(n)
    val weights = IntArray(n)
    for (i in 0 until n) {
        values[i] = scanner.nextInt()
        weights[i] = scanner.nextInt()
    }
    println(getOptimalValue(capacity, values, weights))
}
