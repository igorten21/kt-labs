package laba4

fun main() {

    print("введите группу крови: ")
    val string= readln()

    when (string.uppercase()) {
        "A" -> println("для переливания доступна только группа A")
        "B" -> println("для переливания доступны группы A и B")
        "AB" -> println("для переливания доступны группы A и AB")
        "О" -> println("для переливания доступны все группы крови")

    }
}