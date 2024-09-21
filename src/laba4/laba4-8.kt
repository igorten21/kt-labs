package laba4

fun main() {

    // я устал писать на английском

    print("введите блюдо: ")
    val t = readln()

    when(t){
        "яичница"-> println("3 минуты")
        "пельмени"-> println("15 минут")
        "рис"-> println("20 минут")
        else-> println("неверное блюдо")
    }


}