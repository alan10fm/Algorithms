fun optimalSequence(n: Int): Int {
    var arrayValues = Array(n + 1) { 0 }
    var listOptimalValues = mutableListOf<Int>()
    val totalMovements = calculateMovements(n, arrayValues, listOptimalValues)
    return totalMovements
}

fun calculateMovements(n: Int, arrayValues: Array<Int>, listOptimalValues: MutableList<Int>): Int {
    if (n <= 1) {
        arrayValues[n] = 0
        return 0
    }
    val movements3 = if (n % 3 == 0) {
        val value = n / 3
        if (arrayValues[value] == 0) calculateMovements(value, arrayValues, listOptimalValues) + 1 else arrayValues[value]
    } else Integer.MAX_VALUE

    val movements2 = if (n % 2 == 0) {
        val value = n / 2
        if (arrayValues[value] == 0) calculateMovements(value, arrayValues, listOptimalValues) + 1 else arrayValues[value]
    } else Integer.MAX_VALUE

    val movements1 = if (arrayValues[n - 1] == 0) calculateMovements(n - 1, arrayValues, listOptimalValues) + 1 else arrayValues[n - 1]

    val minimumMovements = minOf(movements3, minOf(movements2, movements1))
    arrayValues[n] = minimumMovements
    return minimumMovements
}

//fun optimalSequence(n: Int): Int {
//
//    var arrayValues = calculateArray(n, Array(n + 1) { n + 1 })
//
//
//    return arrayValues.last()
//}

//fun calculateArray(n: Int, arrayValues: Array<Int>): Array<Int> {
//    val listOptimalValues = mutableListOf<Int>()
//    for (index in arrayValues.indices) {
//        if (index == 0 || index == 1) {
//            arrayValues[index] = 0
//            continue
//        } else {
//            val operation3 = if (index % 3 == 0) index / 3 else -1
//            val operation2 = if (index % 2 == 0) index / 2 else -1
//            val operation1 = index - 1
//
//            val totalOperation3 = if (operation3 > 0 && index - operation3 > 0) {
//                arrayValues[operation3] + 1
//            } else {
//                -1
//            }
//
//            val totalOperation2 = if (operation2 > 0 && index - operation2 > 0) {
//                arrayValues[operation2] + 1
//            } else {
//                -1
//            }
//
//            val totalOperation1 = if (operation1 > 0 && index - operation1 > 0) {
//                arrayValues[operation1] + 1
//            } else {
//                -1
//            }
//
//            var minimumValue = totalOperation3
//            var previousMinimum = operation3
//            if (minimumValue > 0) {
//                if (totalOperation2 in 1 until minimumValue) {
//                    minimumValue = totalOperation2
//                    previousMinimum = operation2
//                    if (totalOperation1 in 1 until minimumValue) {
//                        minimumValue = totalOperation1
//                        previousMinimum = operation1
//                    }
//                }
//            } else {
//                minimumValue = totalOperation2
//                previousMinimum = operation2
//                if (minimumValue > 0) {
//                    if (totalOperation1 in 1 until minimumValue) {
//                        minimumValue = totalOperation1
//                        previousMinimum = operation1
//                    }
//                } else {
//                    minimumValue = totalOperation1
//                    previousMinimum = operation1
//                }
//            }
//
//            when (previousMinimum) {
//                operation3 -> listOptimalValues.add(operation3)
//                operation2 -> listOptimalValues.add(operation2)
//                operation1 -> listOptimalValues.add(operation1)
//                else -> -1
//            }
//
//            arrayValues[index] = minimumValue
//
////            if (operation1 > 0 && index - operation1 > 0) {
////                val total = arrayValues[operation1] + 1
////                if (total < arrayValues[index]) {
////                    arrayValues[index] = total
////                }
////            }
//
//        }
//    }
//    return arrayValues
//}

//fun main(args: Array<String>) {
//    val scanner = Scanner(System.`in`)
//    val n = scanner.nextInt()
//    val sequence = optimalSequence(n)
//    println(sequence.size - 1)
//    for (x in sequence) {
//        print(x.toString() + " ")
//    }
//}
