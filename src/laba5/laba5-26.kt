package laba5

fun main() {
    print("enter number: ")
    val n = readln().toInt()
    var odd = 0
    var even = 0

    for (i in 1..n) {
        when {
            i % 2 == 0 -> odd += i
            else -> even += i
        }
    }
    println("sum of odd: $odd")
    println("sum of even: $even")
}