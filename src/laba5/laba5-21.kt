package laba5

fun main() {
    print("enter year: ")
    val year = readln().toInt() ?: 2024
    print("Введите месяц: ")
    val month = readln().toInt() ?: 12

    when {
        month > 12 || month < 1 -> {
            println("wrong month")
            return
        }
        year < 1 || year > 10000 -> {
            println("wrong year")
            return
        }
    }

    val leap: Boolean = when {
        year % 4 == 0 && (year % 100 != 0 || year % 400 == 0) -> true
        else -> false
    }

    val days = when(month) {
        4, 6, 9, 11 -> 30
        2 -> when {
            leap -> 29
            else -> 28
        }
        else -> 31
    }

    for (day in 1..days) {
        println("$day.$month.$year")
    }
}