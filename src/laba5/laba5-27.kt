package laba5

fun main() {
    print("enter pyramid height: ")
    val h = readln().toInt()

    for (i in 1..h) {
        print(" ".repeat(h - i))
        print("#".repeat(i * 2 - 1))
        println()
    }
}