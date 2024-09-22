package laba5

fun main() {

    print("enter number: ")
    val n = readln()
    var sum = 0
    for(i in n)
        sum += i.toInt()

    println("sum of digits: $sum")

}