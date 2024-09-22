package laba5

fun main() {
    print("enter number: ")
    val n = readln().toInt()
    var sum = 0.0f
    for (i in 1..n) {
        sum += 1.0f/i
    }

    println("series sum: $sum")
}