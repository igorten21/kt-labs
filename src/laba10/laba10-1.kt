package laba10

fun printNumbers(n: Int) {
    println(if (n <= 0) emptyList() else (n downTo 1).toList())
}

fun main() {
    print("enter n: "); val n  = readln().toInt()
    printNumbers(n)
}