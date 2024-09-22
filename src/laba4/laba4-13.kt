package laba4

fun main(){

    print("введите код ошибки: ")
    val string= readln().toInt()

    when(string) {
        100 -> println("ошибка сети")
        200 -> println("ошибка сервера")
        300 -> println("ошибка доступа")
        else -> println("неизвестная ошибка")
    }
}