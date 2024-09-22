package laba5

fun main() {
    while (true) {
        print("enter first number: ")
        val a = readln().toInt()
        print("enter second number: ")
        val b = readln().toInt()

        print("Введите действие: ")
        val c = readln()
        when {
            c.lowercase() == "stop" -> break
            c == "+" -> println("a + b = ${a + b}")
            c == "*" -> println("a * b = ${a * b}")
            else -> println("error")
        }
    }
}