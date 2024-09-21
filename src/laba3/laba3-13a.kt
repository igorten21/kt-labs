package laba3

fun main() {

    print("enter number: ")
    val a = readln().toInt()

    val a1 = a / 1000
    val a2 = (a % 1000) / 100
    val a3 = (a % 100) / 10
    val a4 = a % 10
    if (a1+a2 == a3+a4)
        println("the sum of its first two digits is equal to the sum of its last two digits");
    else
        println("the sum of its first two digits is not equal to the sum of its last two digits");

}