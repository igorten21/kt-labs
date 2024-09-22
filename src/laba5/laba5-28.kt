package laba5

fun main() {
    print("enter number of digits: ")
    val n = readln().toInt()

    val lst: MutableList<Int> = mutableListOf()

    for (i in 0..<n) {
        print("enter number: ")
        lst.add(readln().toInt())
    }

    println(lst.sorted())
}
/*
тут тоже частично украл, башка уже не варит после душных лаб Кузнецовой,
особенно когда делаешь в два раза больше, потому что человек болел и только ты ему поможешь,
а подвести дорогого тебе человека не очень хочется, честно говоря
*/
