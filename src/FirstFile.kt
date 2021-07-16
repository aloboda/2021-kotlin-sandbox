package com.loboda.firststeps

fun main(args: Array<String>) {
    println(args.contentToString())
    println("Sum: " + sum(3, 5))
    println("Sum(concise): " + sumConcise(3, 5))
    printSum(3, 5)
    println(playWithValAndReturnZero(5))
    println("multiply4Times(5): ${multiply4Times(5)}")
    println("rectangle's perimeter: ${Rectangle(1.0, 2.1).perimiter}")
    println("abvxcda with replaced a to c = ${"abvxcda".replace("a", "c")}")
    printListOfFruits()
    countTill(16)
    println("switchCaseInKotlin(true) => ${switchCaseInKotlin(true)}")
    println("switchCaseInKotlin(123) => ${switchCaseInKotlin(123)}")
    println("switchCaseInKotlin('banana') => ${switchCaseInKotlin("banana")}")
    println("switchCaseInKotlin('grapefruit') => ${switchCaseInKotlin("grapefruit")}")

    println("54 isInRangeOf100: ${isInRangeOf100(54)}")
    println("514 isInRangeOf100: ${isInRangeOf100(514)}")
    println("1000 isNotInRangeOf1000: ${isNotInRangeOf1000(1000)}")
    println("1001 isNotInRangeOf1000: ${isNotInRangeOf1000(1001)}")
    iterateRangeWithProgression(4)
    reversalProgression(5)

    sortFruitsAndPrintout(listOf("Banana", "Apple", "Tomato"))

    println("extractNumberOrNull 55: ${extractNumberOrNull(55)}")
    println("extractNumberOrNull 101: ${extractNumberOrNull(101)}")

    println("muliplicationOfPossibleNumbers(5, null): ${muliplicationOfPossibleNumbers(5, null)}")
    println("muliplicationOfPossibleNumbers(5, 100): ${muliplicationOfPossibleNumbers(5, 100)}")
}

fun muliplicationOfPossibleNumbers(a: Int?, b: Int?): Int? {
    if (a == null || b == null) {
        return null
    }
    return a * b
}

fun extractNumberOrNull(i: Int): Int? {
    return if (i in 1..100) i else null
}

fun sortFruitsAndPrintout(fruitCandidates: List<String>) {
    fruitCandidates
            .filter { it in listOf("Banana", "Apple") }
            .sortedBy { it }
            .forEach({ println(it) })
}

fun reversalProgression(i: Int) {
    for (x in i downTo 1 step 2) {
        println("progression reveral: $x")
    }
}

fun isInRangeOf100(i: Int): String {
    return if (i in 1..100) "Yes" else "No"
}

fun isNotInRangeOf1000(i: Int): String {
    return if (i !in 1..1000) "Yes" else "No"
}

fun iterateRangeWithProgression(input: Int): Unit {
    for (x in 1..input step 2) {
        println("progression $x")
    }
}

fun switchCaseInKotlin(input: Any): String {
    return when (input) {
        42 -> "The magic number"
        true -> "Aye"
        "banana" -> "Delicious"
        123 -> "123 is entered"
        else -> "No reaction here"
    }
}

fun countTill(numberExcluded: Int) {
    var currentNumber = 1
    while (currentNumber < numberExcluded) {
        println("Counting...: $currentNumber")
        currentNumber++
    }
}

fun printListOfFruits() {
    val fruits = listOf("Apple", "Grapefruit", "Banana")
    println("*** Fruits ***")
    for (item in fruits) {
        println(item)
    }
    for (index in fruits.indices) {
        println("Fruit with index $index is ${fruits[index]}")
    }
}

fun sum(a: Int, b: Int): Int {
    return a + b
}

fun sumConcise(a: Int, b: Int) = a + b


fun printSum(a: Int, b: Int) {
    println("sum of $a and $b is ${a + b}")
}

fun playWithValAndReturnZero(input: Int): Int {
    val readableDeffered: Int
    val readable = input;
    val readableInt: Int = input;
    readableDeffered = input
    return input + readable - readableInt - readableDeffered
}

fun multiply4Times(input: Int): Int {
    var x = input
    x *= 2
    return x * 2
}

open class Shape
class Rectangle(var height: Double, var length: Double) : Shape() {
    var perimiter = (height + length) * 2
}

